package com.operaciones.shopper.service;

import java.util.List;

import com.operaciones.shopper.entity.Categoriaproducto;

public interface CategoriaproductoService {

	List<Categoriaproducto> ListarCategoriaproductoDisponible(Integer estado);
	
	void GuardarCategoriaproducto(Categoriaproducto categoria_producto);
	
}
