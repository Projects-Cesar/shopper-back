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

import com.operaciones.shopper.dto.ComprobanteDto;
import com.operaciones.shopper.entity.Comprobante;
import com.operaciones.shopper.service.ComprobanteService;

@RestController
@RequestMapping("/api/comprobante")
public class ComprobanteController {

	final 
	ComprobanteService comprobanteService;

	public ComprobanteController(ComprobanteService comprobanteService) {
		super();
		this.comprobanteService = comprobanteService;
	}
	
	@PostMapping("/save")
    public ResponseEntity<Comprobante> insertarComprobante(@RequestBody ComprobanteDto comprobanteDto) {
		
		Comprobante comprobante = new Comprobante();
		comprobante.setMetodopago(comprobanteDto.getMetodopago());
		comprobante.setOrdenpedido(comprobanteDto.getOrdenpedido());
		
		ZoneId zid = ZoneId.systemDefault();
		ZonedDateTime datetime = ZonedDateTime.now(zid);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern( "yyyy-MM-dd hh:mm:ss" );
        String timeStamp = datetime.format(formatter);
        Timestamp newFecha = Timestamp.valueOf(timeStamp);
		comprobante.setFecha(newFecha);
		
		comprobante.setSerie_recibo(comprobanteDto.getSerie_recibo());
		comprobante.setNumero_recibo(comprobanteDto.getNumero_recibo());
		comprobante.setSub_total(comprobanteDto.getSub_total());
		comprobante.setDescuento(comprobanteDto.getDescuento());
		comprobante.setTotal(comprobanteDto.getTotal());
		
		comprobanteService.GuardarComprobante(comprobante);
		
		return new ResponseEntity<Comprobante>(comprobante, null, HttpStatus.CREATED);
	}
	
}
