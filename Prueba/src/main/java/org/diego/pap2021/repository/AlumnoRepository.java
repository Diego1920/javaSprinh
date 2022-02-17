package org.diego.pap2021.repository;

import org.diego.pap2021.entities.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



	@Repository
	public interface AlumnoRepository extends JpaRepository<Alumno,Long>{
		
	}
	

