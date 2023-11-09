//Model of table anuncio

package com.travelWiz.entity;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
@Table(name = "anuncio")
public class Anuncio implements Serializable{

	private static final long serialVersionUID = 3139531148638350396L;
	
	@Id
	@Column(name = "idanuncio")
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idanuncio;
	
	@Column(name = "texto")
	private String texto;
	
	@Column(name = "imagen")
	private String imagen;
	
	@Column(name = "fecha_inicio")
	private Date fechaInicio;
	
	@Column(name = "fecha_fin")
	private Date fechaFin;
	
	@Column(name = "idtipoanuncio")
	private int idtipoanuncio;
	
	//GETTERS AND SETTERS

	public int getIdanuncio() {
		return idanuncio;
	}

	public void setIdanuncio(int idanuncio) {
		this.idanuncio = idanuncio;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	public int getIdtipoanuncio() {
		return idtipoanuncio;
	}

	public void setIdtipoanuncio(int idtipoanuncio) {
		this.idtipoanuncio = idtipoanuncio;
	}
	

}
