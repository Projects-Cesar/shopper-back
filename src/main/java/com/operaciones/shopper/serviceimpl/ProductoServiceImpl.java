package com.operaciones.shopper.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.operaciones.shopper.entity.Producto;
import com.operaciones.shopper.entity.Tienda;
import com.operaciones.shopper.repository.ProductoDAO;
import com.operaciones.shopper.service.ProductoService;

@Service
@Transactional
public class ProductoServiceImpl implements ProductoService {
	
	final 
	ProductoDAO data;

	public ProductoServiceImpl(ProductoDAO data) {
		super();
		this.data = data;
	}

	
	@Override
	public List<Producto> ListarProductoPorTienda(Tienda tienda) {
		return data.findAllProductoPorTienda(tienda);
	}
	
	@Override
	public void GuardarProducto(Producto producto) {
		data.save(producto);
	}
	
}
