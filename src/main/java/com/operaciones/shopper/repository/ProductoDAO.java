package com.operaciones.shopper.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.operaciones.shopper.entity.Producto;
import com.operaciones.shopper.entity.Tienda;

@Repository
public interface ProductoDAO extends JpaRepository<Producto, Integer> {

	@Query(value = "SELECT p FROM Producto p WHERE p.tienda = :tienda")
	List<Producto> findAllProductoPorTienda(@Param("tienda") Tienda tienda);
	
}
