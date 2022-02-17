package org.diego.pap2021.service;

import java.util.List;

import org.diego.pap2021.entities.Asignatura;
import org.diego.pap2021.entities.Profesor;
import org.diego.pap2021.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProfesorService {
	
	@Autowired
	private ProfesorRepository profesorRepository;
	
	public void crearProfesor(String nombre) throws Exception {
		Profesor profesor = new Profesor(nombre);
		try {
			profesorRepository.save(profesor);
		}
		catch (Exception e) {
			throw new Exception("La asignatura "+nombre+" ya existe");
		}
	}

	public List<Profesor> findAll() {
		return profesorRepository.findAll();
	}

}
