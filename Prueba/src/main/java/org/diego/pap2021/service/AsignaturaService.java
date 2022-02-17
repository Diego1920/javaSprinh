package org.diego.pap2021.service;

import java.util.List;

import org.diego.pap2021.entities.Asignatura;
import org.diego.pap2021.repository.AsignaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//no es necesario en el examen
@Service
public class AsignaturaService {

		@Autowired
		private AsignaturaRepository asignaturaRepository;
		
		public void crearAsignatura(String nombre) throws Exception {
			Asignatura asignatura = new Asignatura(nombre);
			try {
				asignaturaRepository.save(asignatura);
			}
			catch (Exception e) {
				throw new Exception("La asignatura "+nombre+" ya existe");
			}
		}

		public List<Asignatura> findAll() {
			return asignaturaRepository.findAll();
		}
	
}
