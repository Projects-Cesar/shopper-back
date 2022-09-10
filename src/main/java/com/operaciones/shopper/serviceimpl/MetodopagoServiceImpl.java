package com.operaciones.shopper.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.operaciones.shopper.entity.Metodopago;
import com.operaciones.shopper.repository.MetodopagoDAO;
import com.operaciones.shopper.service.MetodopagoService;

@Service
@Transactional
public class MetodopagoServiceImpl implements MetodopagoService {
	
	final 
	MetodopagoDAO data;

	public MetodopagoServiceImpl(MetodopagoDAO data) {
		super();
		this.data = data;
	}

	
	@Override
	public List<Metodopago> ListarMetodoPago() {
		return data.findAll();
	}
	
	@Override
	public void GuardarMetodoPago(Metodopago metodo_pago) {
		data.save(metodo_pago);		
	}

}
