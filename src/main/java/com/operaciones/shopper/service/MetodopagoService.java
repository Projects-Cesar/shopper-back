package com.operaciones.shopper.service;

import java.util.List;

import com.operaciones.shopper.entity.Metodopago;

public interface MetodopagoService {

	List<Metodopago> ListarMetodoPago();
	
	void GuardarMetodoPago(Metodopago metodo_pago);
	
}
