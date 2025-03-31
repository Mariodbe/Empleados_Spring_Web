package com.empleados.backend.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.empleados.backend.model.Empleado;

public interface IEmpleadoDao extends MongoRepository<Empleado, String>{

	
	
}
