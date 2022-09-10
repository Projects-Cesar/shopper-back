package com.operaciones.shopper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.operaciones.shopper.entity.Cliente;

@Repository
public interface ClienteDAO extends JpaRepository<Cliente, Integer> {

	
	
}
