package org.diego.pap2021.service;

import org.diego.pap2021.entities.Alumno;
import org.diego.pap2021.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlumnoService {

	@Autowired
	private AlumnoRepository alumnoRepository;
	
	public void crearAlumno(String dni, String nombre, String apellido, String password) {
	Alumno alumno = new Alumno(dni,nombre,apellido,password);	
		
	}
}
