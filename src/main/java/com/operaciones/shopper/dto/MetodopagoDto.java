package com.operaciones.shopper.dto;

public class MetodopagoDto {

	private String medio_pago;
	
	public MetodopagoDto() {
		super();
	}

	public MetodopagoDto(String medio_pago) {
		super();
		this.medio_pago = medio_pago;
	}

	
	public String getMedio_pago() {
		return medio_pago;
	}

	public void setMedio_pago(String medio_pago) {
		this.medio_pago = medio_pago;
	}

}
