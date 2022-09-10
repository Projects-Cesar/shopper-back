package com.operaciones.shopper.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.operaciones.shopper.entity.Categoriaproducto;

@Repository
public interface CategoriaproductoDAO extends JpaRepository<Categoriaproducto, Integer> {

	@Query(value = "SELECT cp FROM Categoriaproducto cp WHERE cp.estado = ?1")
    List<Categoriaproducto> findAllCategoriaproducto(Integer estado);
	
}
