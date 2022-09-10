package com.operaciones.shopper.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.operaciones.shopper.dto.MetodopagoDto;
import com.operaciones.shopper.entity.Metodopago;
import com.operaciones.shopper.service.MetodopagoService;

@RestController
@RequestMapping("/api/metodopago")
public class MetodopagoController {

	final 
	MetodopagoService metodopagoService;

	public MetodopagoController(MetodopagoService metodopagoService) {
		super();
		this.metodopagoService = metodopagoService;
	}
	
	
	@GetMapping("/list")
	public ResponseEntity<List<Metodopago>> listarMetodoPago() {
		List<Metodopago> lsMetodopago = metodopagoService.ListarMetodoPago();
		return new ResponseEntity<List<Metodopago>>(lsMetodopago, HttpStatus.OK);
	}
	
	
	@PostMapping("/save")
    public ResponseEntity<Metodopago> insertarMetodoPago(@RequestBody MetodopagoDto metodo_pagoDto) {
		
		Metodopago metodo_pago = new Metodopago();
		metodo_pago.setMedio_pago(metodo_pagoDto.getMedio_pago());
		
		metodopagoService.GuardarMetodoPago(metodo_pago);
		
		return new ResponseEntity<Metodopago>(metodo_pago, null, HttpStatus.CREATED);
	}
	
}
