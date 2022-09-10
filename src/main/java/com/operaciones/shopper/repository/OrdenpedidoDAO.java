package com.operaciones.shopper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.operaciones.shopper.entity.Ordenpedido;

@Repository
public interface OrdenpedidoDAO extends JpaRepository<Ordenpedido, Integer> {

}
