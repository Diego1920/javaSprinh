package org.diego.pap2021.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {

	//definir atributos
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(unique=true)
	private String dni;
	private String password;
	private String nombre;
	private String apellido;
	
	//==============
	
	public Usuario() {
	}
	
	public Usuario(String dni, String nombre, String apellido, String password) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.password = password;
	}
	
	
	//===============
	//se generan get y set
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	
	
}
