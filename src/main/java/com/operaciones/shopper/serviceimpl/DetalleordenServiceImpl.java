package com.operaciones.shopper.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.operaciones.shopper.entity.Detalleorden;
import com.operaciones.shopper.entity.Ordenpedido;
import com.operaciones.shopper.repository.DetalleordenDAO;
import com.operaciones.shopper.service.DetalleordenService;

@Service
@Transactional
public class DetalleordenServiceImpl implements DetalleordenService {

	final 
	DetalleordenDAO data;

	public DetalleordenServiceImpl(DetalleordenDAO data) {
		super();
		this.data = data;
	}

	@Override
	public List<Detalleorden> ListarDetalleOrdenPorOrdenpedido(Ordenpedido orden_pedido) {
		return data.findAllDetalleordenPorOrdenpedido(orden_pedido);
	}

	@Override
	public void GuardarDetalleOrden(Detalleorden detalle_orden) {
		data.save(detalle_orden);
	}

	@Override
	public Detalleorden BuscarDetalleordenPorCodDetalleorden(Integer cod_detalle_orden) {
		return data.findDetalleordenByCodDetalleorden(cod_detalle_orden);
	}

	

	
	
	
	
}
