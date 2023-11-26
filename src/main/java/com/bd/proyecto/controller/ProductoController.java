package com.bd.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bd.proyecto.modelo.ClassProducto;
import com.bd.proyecto.servicios.IeProductoServicioImp;



@Controller
@RequestMapping("/Productos")
public class ProductoController {
	@Autowired
	private IeProductoServicioImp ieproductoimp;
	
	@GetMapping("/ListadoProductos")
	public String ListadoProductos(Model modelo) {
		//sacamos la data
		List<ClassProducto> lista = ieproductoimp.ListadoProducto();
		
		//enviar a la vista
		modelo.addAttribute("listado",lista);
		
		//vamos a la vista
		return "Vistas/Producto/ListadoProductos";
	}
	
	//REGISTRAR
	@GetMapping("/RegistrarProducto")
	public String RegistrarProducto(Model model) {
		//realizamos la respectiva instancia
		ClassProducto producto = new ClassProducto();
		//enviamos objeto a la vista
		model.addAttribute("producto",producto);
		//retornar a la vista
		return "Vistas/Producto/FormularioProductos";
	}
	
	//GUARDAR
	@PostMapping("/GuardarProducto")
	public String GuardarProducto(@ModelAttribute ClassProducto producto) {	
		//aplicamos inyeccion
		ieproductoimp.RegistrarProducto(producto);
		//retornar al listado
		return "redirect:/Productos/ListadoProductos";
	}
	
	//REGISTRAR
	@GetMapping("/Editar/{id}")
	public String EditarProducto(@PathVariable("id") Integer id, Model model) {
		//buscamos el objeto
		ClassProducto producto = ieproductoimp.BuscarProducto(id);
		//enviamos objeto a la vista
		model.addAttribute("producto",producto);
		//retornar a la vista
		return "Vistas/Producto/FormularioProductos";
	}
	
	//ELIMINAR
	@GetMapping("/Eliminar/{id}")
	public String EliminarProducto(@PathVariable("id") Integer id) {
		//borramos el objeto
		ieproductoimp.BorrarProducto(id);
		//retornar al listado
		return "redirect:/Productos/ListadoProductos";
	}
}
