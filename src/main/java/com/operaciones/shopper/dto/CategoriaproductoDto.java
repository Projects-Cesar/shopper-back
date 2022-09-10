package com.operaciones.shopper.dto;

import javax.validation.constraints.NotBlank;

public class CategoriaproductoDto {

	@NotBlank
	private String nombre;
	private Integer estado;

	public CategoriaproductoDto() {
		super();
	}

	public CategoriaproductoDto(@NotBlank String nombre, Integer estado) {
		super();
		this.nombre = nombre;
		this.estado = estado;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

}
