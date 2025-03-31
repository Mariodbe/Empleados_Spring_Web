package com.empleados.backend.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empleados.backend.dao.IEmpleadoDao;
import com.empleados.backend.model.Empleado;
import com.empleados.backend.services.IEmpleadoService;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService{
	
	@Autowired
	private IEmpleadoDao empleadoDao;

	@Override
	public List<Empleado> buscar() {
		return empleadoDao.findAll();
	}

	@Override
	public Empleado buscarporid(String id) {
		Optional<Empleado> empl = empleadoDao.findById(id);
		if(empl.isPresent()) {
			return empl.get();
		}
		return null;
	}

	@Override
	public Empleado guardar(Empleado empleado) {
		return empleadoDao.save(empleado);
	}

	@Override
	public void eliminar(String id) {
		empleadoDao.deleteById(id);
	}

	
}
