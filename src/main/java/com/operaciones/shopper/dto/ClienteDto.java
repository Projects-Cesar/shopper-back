package com.operaciones.shopper.dto;

public class ClienteDto {

	private String nombre_cliente;
	private String numero_cuenta;
	private String direccion;
	private String sexo;
	private String correo;
	private String dni;
	private String telefono;
	private Integer estado;
	
	public ClienteDto() {
		super();
	}

	public ClienteDto(String nombre_cliente, String numero_cuenta, String direccion, String sexo, String correo,
			String dni, String telefono, Integer estado) {
		super();
		this.nombre_cliente = nombre_cliente;
		this.numero_cuenta = numero_cuenta;
		this.direccion = direccion;
		this.sexo = sexo;
		this.correo = correo;
		this.dni = dni;
		this.telefono = telefono;
		this.estado = estado;
	}

	
	public String getNombre_cliente() {
		return nombre_cliente;
	}

	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}

	public String getNumero_cuenta() {
		return numero_cuenta;
	}

	public void setNumero_cuenta(String numero_cuenta) {
		this.numero_cuenta = numero_cuenta;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

}
