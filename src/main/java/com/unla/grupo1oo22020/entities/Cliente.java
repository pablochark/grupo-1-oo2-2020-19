package com.unla.grupo1oo22020.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente extends Persona {
	
	@Column(name="email")
	private String email;

	public Cliente() {
		super();
	}


	public Cliente(long idPersona, long dni, String apellido, String nombre, LocalDate fechaNacimiento, String email) {
		super(idPersona, dni, apellido, nombre, fechaNacimiento);
		this.email = email;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


}