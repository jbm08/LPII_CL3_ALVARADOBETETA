package com.bd.proyecto.repo;

import org.springframework.data.repository.CrudRepository;
import com.bd.proyecto.modelo.ClassProducto;

public interface IeProducto extends CrudRepository<ClassProducto, Integer> {

}
