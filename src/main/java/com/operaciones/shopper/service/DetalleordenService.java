package com.operaciones.shopper.service;

import java.util.List;

import com.operaciones.shopper.entity.Detalleorden;
import com.operaciones.shopper.entity.Ordenpedido;

public interface DetalleordenService {

	List<Detalleorden> ListarDetalleOrdenPorOrdenpedido(Ordenpedido orden_pedido);
	
	void GuardarDetalleOrden(Detalleorden detalle_orden);
	
	Detalleorden BuscarDetalleordenPorCodDetalleorden(Integer cod_detalle_orden);
	
}
