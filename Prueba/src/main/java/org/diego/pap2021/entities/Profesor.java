package org.diego.pap2021.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.OneToMany;


@Entity
public class Profesor extends Usuario{

	@OneToMany(mappedBy = "profesor")
	private Collection<Asignatura> asignaturas;
	
	//==========================

	public Profesor(String dni,String password,String nombre, String apellido) {
		super(dni,password,nombre,apellido);
	}
	public Profesor() {
	}
	//==========================
	public Collection<Asignatura> getAsignaturas() {
		return asignaturas;
	}
	public void setAsignaturas(Collection<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}
	
}
