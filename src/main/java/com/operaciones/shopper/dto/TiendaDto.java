package com.operaciones.shopper.dto;

public class TiendaDto {

	private String nombre_tienda;
	private String nombre_titular;
	private String direccion;
	private String telefono;
	private String tiempo_demora;
	private Integer estado;
	
	public TiendaDto() {
		super();
	}

	public TiendaDto(String nombre_tienda, String nombre_titular, String direccion, String telefono,
			String tiempo_demora, Integer estado) {
		super();
		this.nombre_tienda = nombre_tienda;
		this.nombre_titular = nombre_titular;
		this.direccion = direccion;
		this.telefono = telefono;
		this.tiempo_demora = tiempo_demora;
		this.estado = estado;
	}

	
	public String getNombre_tienda() {
		return nombre_tienda;
	}

	public void setNombre_tienda(String nombre_tienda) {
		this.nombre_tienda = nombre_tienda;
	}

	public String getNombre_titular() {
		return nombre_titular;
	}

	public void setNombre_titular(String nombre_titular) {
		this.nombre_titular = nombre_titular;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTiempo_demora() {
		return tiempo_demora;
	}

	public void setTiempo_demora(String tiempo_demora) {
		this.tiempo_demora = tiempo_demora;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	
}
