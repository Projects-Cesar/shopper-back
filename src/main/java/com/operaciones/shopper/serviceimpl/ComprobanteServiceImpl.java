package com.operaciones.shopper.serviceimpl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.operaciones.shopper.entity.Comprobante;
import com.operaciones.shopper.repository.ComprobanteDAO;
import com.operaciones.shopper.service.ComprobanteService;

@Service
@Transactional
public class ComprobanteServiceImpl implements ComprobanteService  {

	final 
	ComprobanteDAO data;

	public ComprobanteServiceImpl(ComprobanteDAO data) {
		super();
		this.data = data;
	}

	@Override
	public void GuardarComprobante(Comprobante comprobante) {
		data.save(comprobante);		
	}
	
	
	
}
