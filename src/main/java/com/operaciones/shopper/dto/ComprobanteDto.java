package com.operaciones.shopper.dto;

import java.sql.Timestamp;

import com.operaciones.shopper.entity.Metodopago;
import com.operaciones.shopper.entity.Ordenpedido;

public class ComprobanteDto {

	private Metodopago metodopago;
	private Ordenpedido ordenpedido;
	private Timestamp fecha;
	private String serie_recibo;
	private String numero_recibo;
	private double sub_total;
	private double descuento;
	private double total;
	
	public ComprobanteDto() {
		super();
	}

	public ComprobanteDto(Metodopago metodopago, Ordenpedido ordenpedido, Timestamp fecha, String serie_recibo,
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
