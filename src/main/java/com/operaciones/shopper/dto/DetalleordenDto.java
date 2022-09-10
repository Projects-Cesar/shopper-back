package com.operaciones.shopper.dto;

import com.operaciones.shopper.entity.Ordenpedido;
import com.operaciones.shopper.entity.Producto;

public class DetalleordenDto {

	private Ordenpedido ordenpedido;
	private Producto producto;
	private int cantidad;
	private double importe;
	
	public DetalleordenDto() {
		super();
	}

	public DetalleordenDto(Ordenpedido ordenpedido, Producto producto, int cantidad, double importe) {
		super();
		this.ordenpedido = ordenpedido;
		this.producto = producto;
		this.cantidad = cantidad;
		this.importe = importe;
	}

	
	public Ordenpedido getOrdenpedido() {
		return ordenpedido;
	}

	public void setOrdenpedido(Ordenpedido ordenpedido) {
		this.ordenpedido = ordenpedido;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}
	
}
