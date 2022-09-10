package com.operaciones.shopper.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.operaciones.shopper.dto.ProductoDto;
import com.operaciones.shopper.entity.Producto;
import com.operaciones.shopper.entity.Tienda;
import com.operaciones.shopper.service.ProductoService;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {

	final 
	ProductoService productoService;
	
	public ProductoController(ProductoService productoService) {
		super();
		this.productoService = productoService;
	}


//	@GetMapping("/list")
	@PostMapping("/list")
	public ResponseEntity<List<Producto>> listarProductoPorTienda(@RequestBody Tienda item_tienda) {
		Tienda tienda = new Tienda();
		tienda.setCod_tienda(item_tienda.getCod_tienda());
		
		List<Producto> producto = productoService.ListarProductoPorTienda(tienda);
		return new ResponseEntity<List<Producto>>(producto, HttpStatus.OK);
	}
	
	@PostMapping("/save")
    public ResponseEntity<Producto> insertarProducto(@RequestBody ProductoDto productoDto) {
		
		Producto producto = new Producto();
		producto.setCategoriaproducto(productoDto.getCategoriaproducto());
		producto.setTienda(productoDto.getTienda());
		producto.setNombre_producto(productoDto.getNombre_producto());
		producto.setStock(productoDto.getStock());
		producto.setMarca(productoDto.getMarca());
		producto.setPrecio_unidad(productoDto.getPrecio_unidad());
		producto.setDescripcion(productoDto.getDescripcion());
		producto.setImagen(productoDto.getImagen());
		producto.setEstado(1);
		
		productoService.GuardarProducto(producto);
		
		return new ResponseEntity<Producto>(producto, null, HttpStatus.CREATED);
	}
	
}
