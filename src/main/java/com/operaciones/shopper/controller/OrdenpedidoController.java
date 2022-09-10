package com.operaciones.shopper.controller;

import java.sql.Timestamp;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.operaciones.shopper.dto.OrdenpedidoDto;
import com.operaciones.shopper.entity.Ordenpedido;
import com.operaciones.shopper.service.OrdenpedidoService;

@RestController
@RequestMapping("/api/ordenpedido")
public class OrdenpedidoController {

	final 
	OrdenpedidoService ordenpedidoService;

	public OrdenpedidoController(OrdenpedidoService ordenpedidoService) {
		super();
		this.ordenpedidoService = ordenpedidoService;
	}
	
	@PostMapping("/save")
    public ResponseEntity<Ordenpedido> insertarOrdenPedido(@RequestBody OrdenpedidoDto orden_pedidoDto) {
		
		Ordenpedido orden_pedido = new Ordenpedido();
		orden_pedido.setCliente(orden_pedidoDto.getCliente());
		
		ZoneId zid = ZoneId.systemDefault();
		ZonedDateTime datetime = ZonedDateTime.now(zid);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern( "yyyy-MM-dd hh:mm:ss" );
        String timeStamp = datetime.format(formatter);
        Timestamp newFecha = Timestamp.valueOf(timeStamp);
		orden_pedido.setFecha(newFecha);
		
		ordenpedidoService.GuardarOrdenPedido(orden_pedido);
		
		return new ResponseEntity<Ordenpedido>(orden_pedido, null, HttpStatus.CREATED);
	}
	
}
