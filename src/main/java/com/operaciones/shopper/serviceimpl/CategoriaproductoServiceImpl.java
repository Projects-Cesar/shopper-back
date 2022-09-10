package com.operaciones.shopper.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.operaciones.shopper.entity.Categoriaproducto;
import com.operaciones.shopper.repository.CategoriaproductoDAO;
import com.operaciones.shopper.service.CategoriaproductoService;

@Service
@Transactional
public class CategoriaproductoServiceImpl implements CategoriaproductoService {

	final
	CategoriaproductoDAO data;
	
	public CategoriaproductoServiceImpl(CategoriaproductoDAO data) {
		super();
		this.data = data;
	}

	@Override
	public List<Categoriaproducto> ListarCategoriaproductoDisponible(Integer estado) {
		return data.findAllCategoriaproducto(estado);
	}

	@Override
	public void GuardarCategoriaproducto(Categoriaproducto categoria_producto) {
		data.save(categoria_producto);
	}

}
