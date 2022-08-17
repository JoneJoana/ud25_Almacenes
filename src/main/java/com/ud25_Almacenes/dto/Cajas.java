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
	private String num_ref;

	private String contenido;
	private int valor;
	
	@ManyToOne()
	@JoinColumn(name="almacen")
	private Almacenes almacen;
	
	private Cajas() {}

	public Cajas(String contenido, int valor, Almacenes almacen) {
		this.contenido = contenido;
		this.valor = valor;
		this.almacen = almacen;
	}
	

	public String getNum_ref() {
		return num_ref;
	}

	public void setNum_ref(String num_ref) {
		this.num_ref = num_ref;
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
		return "Cajas [num_ref=" + num_ref + ", contenido=" + contenido + ", valor=" + valor + ", almacen=" + almacen
				+ "]";
	}

}
