package com.operaciones.shopper.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.operaciones.shopper.entity.Tienda;
import com.operaciones.shopper.repository.TiendaDAO;
import com.operaciones.shopper.service.TiendaService;

@Service
@Transactional
public class TiendaServiceImpl implements TiendaService {

	final 
	TiendaDAO data;

	public TiendaServiceImpl(TiendaDAO data) {
		super();
		this.data = data;
	}

	@Override
	public List<Tienda> ListarTiendasDisponibles(Integer estado) {
		return data.findAllTienda(estado);
	}

	@Override
	public void GuardarTienda(Tienda tienda) {
		data.save(tienda);		
	}
	
	
	
}
