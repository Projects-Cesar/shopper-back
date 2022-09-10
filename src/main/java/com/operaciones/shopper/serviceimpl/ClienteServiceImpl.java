package com.operaciones.shopper.serviceimpl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.operaciones.shopper.entity.Cliente;
import com.operaciones.shopper.repository.ClienteDAO;
import com.operaciones.shopper.service.ClienteService;

@Service
@Transactional
public class ClienteServiceImpl implements ClienteService {

	final
	ClienteDAO data;

	public ClienteServiceImpl(ClienteDAO data) {
		super();
		this.data = data;
	}

	@Override
	public void GuardarCliente(Cliente cliente) {
		data.save(cliente);		
	}
	
	
	
}
