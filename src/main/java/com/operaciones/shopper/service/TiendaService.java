package com.operaciones.shopper.service;

import java.util.List;

import com.operaciones.shopper.entity.Tienda;

public interface TiendaService {

	List<Tienda> ListarTiendasDisponibles(Integer estado);
	
	void GuardarTienda(Tienda tienda);
	
}
