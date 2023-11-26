package com.bd.proyecto.servicios;

import java.util.List;
import com.bd.proyecto.modelo.ClassProducto;

public interface IeProductoServicio {
	public List<ClassProducto> ListadoProducto();
	public void RegistrarProducto(ClassProducto p);
	public ClassProducto BuscarProducto(Integer id);
	public void BorrarProducto(Integer id);
}
