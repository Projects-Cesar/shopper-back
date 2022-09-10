package com.operaciones.shopper.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.operaciones.shopper.dto.TiendaDto;
import com.operaciones.shopper.entity.Tienda;
import com.operaciones.shopper.service.TiendaService;

@RestController
@RequestMapping("/api/tienda")
public class TiendaController {

	final 
	TiendaService tiendaService;
	
	public TiendaController(TiendaService tiendaService) {
		super();
		this.tiendaService = tiendaService;
	}

	
	@GetMapping("/list")
	public ResponseEntity<List<Tienda>> listarTiendas() {
		Integer estado = 1;
		List<Tienda> tienda = tiendaService.ListarTiendasDisponibles(estado);
		return new ResponseEntity<List<Tienda>>(tienda, HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Tienda> listarTiendas(@RequestBody TiendaDto tiendaDto) {
		Tienda tienda = new Tienda();
		tienda.setNombre_tienda(tiendaDto.getNombre_tienda());
		tienda.setNombre_titular(tiendaDto.getNombre_titular());
		tienda.setDireccion(tiendaDto.getDireccion());
		tienda.setTelefono(tiendaDto.getTelefono());
		tienda.setTiempo_demora(tiendaDto.getTiempo_demora());
		tienda.setEstado(1);
		tiendaService.GuardarTienda(tienda);
		return new ResponseEntity<Tienda>(tienda, null, HttpStatus.CREATED);
	}
	
}
