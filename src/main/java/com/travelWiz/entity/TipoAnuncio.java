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
@Table(name = "tipo_anuncio")

public class TipoAnuncio implements Serializable{

	private static final long serialVersionUID = 5278514197774776585L;
	
	@Id
	@Column(name = "idtipoanuncio")
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idtipoanuncio;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "imagen")
	private String imagen;

	public int getIdtipoanuncio() {
		return idtipoanuncio;
	}

	public void setIdtipoanuncio(int idtipoanuncio) {
		this.idtipoanuncio = idtipoanuncio;
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
