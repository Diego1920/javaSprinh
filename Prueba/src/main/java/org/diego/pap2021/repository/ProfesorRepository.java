package org.diego.pap2021.repository;

import org.diego.pap2021.entities.Alumno;
import org.diego.pap2021.entities.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


	@Repository
	public interface ProfesorRepository extends JpaRepository<Profesor,Long>{
		
	
}
