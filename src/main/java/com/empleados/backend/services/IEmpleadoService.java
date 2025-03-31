package com.empleados.backend.services;

import java.util.List;

import com.empleados.backend.model.Empleado;

public interface IEmpleadoService {

	List<Empleado> buscar();
	Empleado buscarporid(String id);
	Empleado guardar(Empleado empleado);
	void eliminar (String id);

}
