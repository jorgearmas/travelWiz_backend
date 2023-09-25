package com.travelWiz.entity;

import java.io.Serializable;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
@Table(name = "lugar")

public class Lugar implements Serializable {

	private static final long serialVersionUID = -989780402042407971L;
	
	@Id
	@Column(name = "idlugar")
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idlugar;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "imagen")
	private String imagen;

	//GETTERS AND SETTERS  
	public int getIdlugar() {
		return idlugar;
	}

	public void setIdlugar(int idlugar) {
		this.idlugar = idlugar;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
		
}
