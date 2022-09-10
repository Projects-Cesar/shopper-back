package com.operaciones.shopper.entity;

import java.sql.Timestamp;

import javax.persistence.*;

@Entity
@Table(name = "comprobante")
public class Comprobante {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cod_comprobante;
	
	@ManyToOne
	@JoinColumn(name = "cod_metodo_pago")
	private Metodopago metodopago;
	
	@OneToOne
	@JoinColumn(name = "cod_pedido")
	private Ordenpedido ordenpedido;
	
	private Timestamp fecha;
	private String serie_recibo;
	private String numero_recibo;
	private double sub_total;
	private double descuento;
	private double total;
	
	public Comprobante() {
		super();
	}

	public Comprobante(Metodopago metodopago, Ordenpedido ordenpedido, Timestamp fecha, String serie_recibo,
			String numero_recibo, double sub_total, double descuento, double total) {
		super();
		this.metodopago = metodopago;
		this.ordenpedido = ordenpedido;
		this.fecha = fecha;
		this.serie_recibo = serie_recibo;
		this.numero_recibo = numero_recibo;
		this.sub_total = sub_total;
		this.descuento = descuento;
		this.total = total;
	}

	
	public int getCod_comprobante() {
		return cod_comprobante;
	}

	public void setCod_comprobante(int cod_comprobante) {
		this.cod_comprobante = cod_comprobante;
	}

	public Metodopago getMetodopago() {
		return metodopago;
	}

	public void setMetodopago(Metodopago metodopago) {
		this.metodopago = metodopago;
	}

	public Ordenpedido getOrdenpedido() {
		return ordenpedido;
	}

	public void setOrdenpedido(Ordenpedido ordenpedido) {
		this.ordenpedido = ordenpedido;
	}

	public Timestamp getFecha() {
		return fecha;
	}

	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}

	public String getSerie_recibo() {
		return serie_recibo;
	}

	public void setSerie_recibo(String serie_recibo) {
		this.serie_recibo = serie_recibo;
	}

	public String getNumero_recibo() {
		return numero_recibo;
	}

	public void setNumero_recibo(String numero_recibo) {
		this.numero_recibo = numero_recibo;
	}

	public double getSub_total() {
		return sub_total;
	}

	public void setSub_total(double sub_total) {
		this.sub_total = sub_total;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

}
