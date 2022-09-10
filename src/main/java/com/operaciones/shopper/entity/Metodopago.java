package com.operaciones.shopper.entity;

import javax.persistence.*;

@Entity
@Table(name = "metodo_pago")
public class Metodopago {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cod_metodo_pago;
	private String medio_pago;
	
	public Metodopago() {
		super();
	}
	
	public Metodopago(String medio_pago) {
		super();
		this.medio_pago = medio_pago;
	}
	
	
	public int getCod_metodo_pago() {
		return cod_metodo_pago;
	}
	
	public void setCod_metodo_pago(int cod_metodo_pago) {
		this.cod_metodo_pago = cod_metodo_pago;
	}
	
	public String getMedio_pago() {
		return medio_pago;
	}
	
	public void setMedio_pago(String medio_pago) {
		this.medio_pago = medio_pago;
	}
	
}
