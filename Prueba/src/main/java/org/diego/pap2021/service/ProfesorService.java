package org.diego.pap2021.service;

import java.util.List;

import org.diego.pap2021.entities.Asignatura;
import org.diego.pap2021.entities.Profesor;
import org.diego.pap2021.repository.AsignaturaRepository;
import org.diego.pap2021.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProfesorService {
	
	@Autowired
	private ProfesorRepository profesorRepository;
	
	
	@Autowired
	private AsignaturaRepository asignaturaRepository;
	
	public void crearProfesor(String dni,String password,String nombre,String apellido,List<Long> idAsignatura) throws Exception {
		Profesor profesor = new Profesor(dni,password,nombre,apellido);
	
		for(Long id:idAsignatura) {
			Asignatura asignatura=asignaturaRepository.getById(id);
			//asignatura.setProfesor(profesor);//le dice a asignatura que ese es el profesor
			
			
			rofesor.getAsignaturas().add(asignatura);
		}
		
	profesorRepository.save(profesor);
}
}
