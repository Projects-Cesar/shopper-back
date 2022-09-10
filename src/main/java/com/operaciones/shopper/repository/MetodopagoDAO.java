package com.operaciones.shopper.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.operaciones.shopper.entity.Metodopago;

@Repository
public interface MetodopagoDAO extends JpaRepository<Metodopago, Integer> {

//	List<Metodopago> findAllMetodopago();
	
}
