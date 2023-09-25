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
@Table(name = "estado")
public class Estado implements Serializable{

	private static final long serialVersionUID = -2886792881905408406L;
	
	@Id
	@Column(name = "idestado")
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idestado;
	
	@Column(name = "valor")
	private String valor;
	
	@Column(name = "tabla")
	private String tabla;
	
	@Column(name = "campo")
	private String campo;
	
	//GETTERS AND SETTERS

	public int getIdestado() {
		return idestado;
	}

	public void setIdestado(int idestado) {
		this.idestado = idestado;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getTabla() {
		return tabla;
	}

	public void setTabla(String tabla) {
		this.tabla = tabla;
	}

	public String getCampo() {
		return campo;
	}

	public void setCampo(String campo) {
		this.campo = campo;
	}
	
}
