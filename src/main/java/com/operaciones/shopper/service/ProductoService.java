package com.operaciones.shopper.service;

import java.util.List;

import com.operaciones.shopper.entity.Producto;
import com.operaciones.shopper.entity.Tienda;

public interface ProductoService {

	List<Producto> ListarProductoPorTienda(Tienda tienda);
	
	void GuardarProducto(Producto producto);
	
}
