package com.operaciones.shopper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.operaciones.shopper.entity.Comprobante;

@Repository
public interface ComprobanteDAO extends JpaRepository<Comprobante, Integer> {

}
