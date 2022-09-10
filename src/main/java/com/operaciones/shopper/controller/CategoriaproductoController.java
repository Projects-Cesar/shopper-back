package com.operaciones.shopper.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.operaciones.shopper.dto.CategoriaproductoDto;
import com.operaciones.shopper.entity.Categoriaproducto;
import com.operaciones.shopper.service.CategoriaproductoService;

@RestController
@RequestMapping("/api/categoriaproducto")
public class CategoriaproductoController {
	
	final
	CategoriaproductoService categoriaProductoService;
	
	public CategoriaproductoController(CategoriaproductoService categoriaProductoService) {
		super();
		this.categoriaProductoService = categoriaProductoService;
	}



	@GetMapping("/list")
	public ResponseEntity<List<Categoriaproducto>> listarCategoriaproductos() {
		Integer estado = 1;
		List<Categoriaproducto> cprod = categoriaProductoService.ListarCategoriaproductoDisponible(estado);
		return new ResponseEntity<List<Categoriaproducto>>(cprod, HttpStatus.OK);
	}
	
	@PostMapping("/save")
    public ResponseEntity<Categoriaproducto> insertarCategoriaProducto(@RequestBody CategoriaproductoDto catProdDto) {
		Categoriaproducto catProd = new Categoriaproducto();
		catProd.setNombre(catProdDto.getNombre());
		catProd.setEstado(1);
		categoriaProductoService.GuardarCategoriaproducto(catProd);
		return new ResponseEntity<Categoriaproducto>(catProd, null, HttpStatus.CREATED);
	}
	
}
