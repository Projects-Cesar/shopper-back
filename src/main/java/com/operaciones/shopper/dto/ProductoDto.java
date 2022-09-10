package com.operaciones.shopper.dto;

import com.operaciones.shopper.entity.Categoriaproducto;
import com.operaciones.shopper.entity.Tienda;

public class ProductoDto {

	private Categoriaproducto categoriaproducto;
	private Tienda tienda;
	private String nombre_producto;
	private int stock;
	private String marca;
	private double precio_unidad;
	private String descripcion;
	private String imagen;
	private Integer estado;
	
	public ProductoDto() {
		super();
	}

	public ProductoDto(Categoriaproducto categoriaproducto, Tienda tienda, String nombre_producto, int stock,
			String marca, double precio_unidad, String descripcion, String imagen, Integer estado) {
		super();
		this.categoriaproducto = categoriaproducto;
		this.tienda = tienda;
		this.nombre_producto = nombre_producto;
		this.stock = stock;
		this.marca = marca;
		this.precio_unidad = precio_unidad;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.estado = estado;
	}

	
	public Categoriaproducto getCategoriaproducto() {
		return categoriaproducto;
	}

	public void setCategoriaproducto(Categoriaproducto categoriaproducto) {
		this.categoriaproducto = categoriaproducto;
	}

	public Tienda getTienda() {
		return tienda;
	}

	public void setTienda(Tienda tienda) {
		this.tienda = tienda;
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio_unidad() {
		return precio_unidad;
	}

	public void setPrecio_unidad(double precio_unidad) {
		this.precio_unidad = precio_unidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

}
