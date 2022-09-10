package com.operaciones.shopper.dto;

import java.sql.Timestamp;

import com.operaciones.shopper.entity.Cliente;

public class OrdenpedidoDto {

	private Cliente cliente;
	private Timestamp fecha;
	
	public OrdenpedidoDto() {
		super();
	}

	public OrdenpedidoDto(Cliente cliente, Timestamp fecha) {
		super();
		this.cliente = cliente;
		this.fecha = fecha;
	}

	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Timestamp getFecha() {
		return fecha;
	}

	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}

}
