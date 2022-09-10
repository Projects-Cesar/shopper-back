package com.operaciones.shopper.serviceimpl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.operaciones.shopper.entity.Ordenpedido;
import com.operaciones.shopper.repository.OrdenpedidoDAO;
import com.operaciones.shopper.service.OrdenpedidoService;

@Service
@Transactional
public class OrdenpedidoServiceImpl implements OrdenpedidoService {
	
	final 
	OrdenpedidoDAO data;

	public OrdenpedidoServiceImpl(OrdenpedidoDAO data) {
		super();
		this.data = data;
	}

	@Override
	public void GuardarOrdenPedido(Ordenpedido orden_pedido) {
		data.save(orden_pedido);		
	}
	
	

}
