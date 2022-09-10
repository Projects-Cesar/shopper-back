package com.operaciones.shopper.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.operaciones.shopper.dto.DetalleordenDto;
import com.operaciones.shopper.entity.Detalleorden;
import com.operaciones.shopper.entity.Ordenpedido;
import com.operaciones.shopper.service.DetalleordenService;

@RestController
@RequestMapping("/api/detalleorden")
public class DetalleordenController {

	final 
	DetalleordenService detalleordenService;

	public DetalleordenController(DetalleordenService detalleordenService) {
		super();
		this.detalleordenService = detalleordenService;
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<Detalleorden>> listarDetalleOrdenPorProducto(
			@RequestBody Ordenpedido orden_pedido) {
		
		Ordenpedido pedido = new Ordenpedido();
		pedido.setCod_pedido(orden_pedido.getCod_pedido());
		
		List<Detalleorden> lsDetProd = detalleordenService.ListarDetalleOrdenPorOrdenpedido(pedido);
		
		return new ResponseEntity<List<Detalleorden>>(lsDetProd, HttpStatus.OK);
	}	
	
	@PostMapping("/save")
    public ResponseEntity<Detalleorden> insertarDetalleOrden(@RequestBody DetalleordenDto detalle_ordenDto) {
		
		Detalleorden detalle_orden = new Detalleorden();
		detalle_orden.setOrdenpedido(detalle_ordenDto.getOrdenpedido());
		detalle_orden.setProducto(detalle_ordenDto.getProducto());
		detalle_orden.setCantidad(detalle_ordenDto.getCantidad());
		detalle_orden.setImporte(detalle_ordenDto.getImporte());
		
		detalleordenService.GuardarDetalleOrden(detalle_orden);
		
		return new ResponseEntity<Detalleorden>(detalle_orden, null, HttpStatus.CREATED);
	}
	
	@PutMapping("/update/{cod_detalle_orden}")
	public ResponseEntity<Detalleorden> actualizarDetalleorden(@PathVariable("cod_detalle_orden") Integer cod_detalle_orden, 
			@RequestBody DetalleordenDto detalle_ordenDto) {
		
		Detalleorden detOrden = detalleordenService.BuscarDetalleordenPorCodDetalleorden(cod_detalle_orden);
		
		Detalleorden detalle_orden = detOrden;
		detalle_orden.setCantidad(detalle_ordenDto.getCantidad());
		detalle_orden.setImporte(detalle_ordenDto.getImporte());
		
		detalleordenService.GuardarDetalleOrden(detalle_orden);
		
		return new ResponseEntity<Detalleorden>(detalle_orden, null, HttpStatus.ACCEPTED);
	}
	
}
