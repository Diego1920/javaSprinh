package org.diego.pap2021.repository;

import org.diego.pap2021.entities.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



	@Repository
	public interface AsignaturaRepository extends JpaRepository<Asignatura,Long>{
		

}
