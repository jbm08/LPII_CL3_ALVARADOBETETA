package com.bd.proyecto.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd.proyecto.modelo.ClassProducto;
import com.bd.proyecto.repo.IeProducto;

@Service
public class IeProductoServicioImp implements IeProductoServicio {
	@Autowired
	private IeProducto repositorio;
	
	@Override
	public List<ClassProducto> ListadoProducto() {
		// TODO Auto-generated method stub
		return (List<ClassProducto>) repositorio.findAll();
	}

	@Override
	public void RegistrarProducto(ClassProducto p) {
		// TODO Auto-generated method stub
		repositorio.save(p);

	}

	@Override
	public ClassProducto BuscarProducto(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).orElse(null);
	}

	@Override
	public void BorrarProducto(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);
	}

}
