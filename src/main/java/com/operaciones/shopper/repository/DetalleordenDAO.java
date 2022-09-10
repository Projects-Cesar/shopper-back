package com.operaciones.shopper.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.operaciones.shopper.entity.Detalleorden;
import com.operaciones.shopper.entity.Ordenpedido;

@Repository
public interface DetalleordenDAO extends JpaRepository<Detalleorden, Integer> {
	
	@Query(value = "SELECT do FROM Detalleorden do WHERE do.ordenpedido = :ordenpedido")
    List<Detalleorden> findAllDetalleordenPorOrdenpedido(@Param("ordenpedido") Ordenpedido ordenpedido);
	
	@Query(value = "SELECT do FROM Detalleorden do WHERE do.cod_detalle_orden = ?1")
	Detalleorden findDetalleordenByCodDetalleorden(Integer cod_detalle_orden);
	
}
