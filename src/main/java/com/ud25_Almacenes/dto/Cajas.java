package com.ud25_Almacenes.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="cajas")
public class Cajas {
	
	@Id
	private String numRef;

	private String contenido;
	private int valor;
	
	@ManyToOne()
	@JoinColumn(name="almacen")
	private Almacenes almacen;
	
	private Cajas() {}

	public Cajas(String numRef,String contenido, int valor, Almacenes almacen) {
		this.numRef = numRef;
		this.contenido = contenido;
		this.valor = valor;
		this.almacen = almacen;
	}
	

	public String getNumRef() {
		return numRef;
	}

	public void setNumRef(String numRef) {
		this.numRef = numRef;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Almacenes getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacenes almacen) {
		this.almacen = almacen;
	}

	@Override
	public String toString() {
		return "Cajas [numRef=" + numRef + ", contenido=" + contenido + ", valor=" + valor + ", almacen=" + almacen
				+ "]";
	}

}
