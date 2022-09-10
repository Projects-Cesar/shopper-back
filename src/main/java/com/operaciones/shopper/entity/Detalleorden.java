package com.operaciones.shopper.entity;

import javax.persistence.*;

@Entity
@Table(name = "detalle_orden")
public class Detalleorden {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cod_detalle_orden;
	
	@ManyToOne
	@JoinColumn(name = "cod_pedido")
	private Ordenpedido ordenpedido;
	
	@ManyToOne
	@JoinColumn(name = "cod_producto")
	private Producto producto;
	
	private int cantidad;
	private double importe;
	
	public Detalleorden() {
		super();
	}

	public Detalleorden(Ordenpedido ordenpedido, Producto producto, int cantidad, double importe) {
		super();
		this.ordenpedido = ordenpedido;
		this.producto = producto;
		this.cantidad = cantidad;
		this.importe = importe;
	}

	
	public int getCod_detalle_orden() {
		return cod_detalle_orden;
	}

	public void setCod_detalle_orden(int cod_detalle_orden) {
		this.cod_detalle_orden = cod_detalle_orden;
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
