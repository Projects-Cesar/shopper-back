package com.operaciones.shopper.entity;

import javax.persistence.*;

@Entity
@Table(name = "categoria_producto")
public class Categoriaproducto {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cod_categoria;
	private String nombre;
	private Integer estado;
	
	public Categoriaproducto() {
		super();
	}

	public Categoriaproducto(String nombre, Integer estado) {
		super();
		this.nombre = nombre;
		this.estado = estado;
	}

	
	public int getCod_categoria() {
		return cod_categoria;
	}

	public void setCod_categoria(int cod_categoria) {
		this.cod_categoria = cod_categoria;
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
