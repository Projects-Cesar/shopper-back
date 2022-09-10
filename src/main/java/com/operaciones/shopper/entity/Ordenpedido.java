package com.operaciones.shopper.entity;

import java.sql.Timestamp;

import javax.persistence.*;

@Entity
@Table(name = "orden_pedido")
public class Ordenpedido {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cod_pedido;
	
	@ManyToOne
	@JoinColumn(name = "cod_cliente")
	private Cliente cliente;
		
	private Timestamp fecha;
	
	public Ordenpedido() {
		super();
	}

	public Ordenpedido(Cliente cliente, Timestamp fecha) {
		super();
		this.cliente = cliente;
		this.fecha = fecha;
	}

	
	public int getCod_pedido() {
		return cod_pedido;
	}

	public void setCod_pedido(int cod_pedido) {
		this.cod_pedido = cod_pedido;
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
