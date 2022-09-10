package com.operaciones.shopper.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.operaciones.shopper.entity.Tienda;

@Repository
public interface TiendaDAO extends JpaRepository<Tienda, Integer> {

	@Query(value = "SELECT t FROM Tienda t WHERE t.estado = ?1")
	List<Tienda> findAllTienda(Integer estado);
	
}
