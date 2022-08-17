package com.ud25_Almacenes.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="almacenes")
public class Almacenes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String lugar;
	private int capacidad;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "almacen") //mappedBy la variable de Cajas que hace ref a Almacenes
	private List<Cajas> cajas;
	
	public Almacenes() {}
	
	//ver si hay que eliminar el id de constructor ya que es autoincrement
	public Almacenes(int id, String lugar, int capacidad) {
		this.id = id;
		this.lugar = lugar;
		this.capacidad = capacidad;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public List<Cajas> getCajas() {
		return cajas;
	}

	public void setCajas(List<Cajas> cajas) {
		this.cajas = cajas;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Almacenes [id=" + id + ", lugar=" + lugar + ", capacidad=" + capacidad + "]";
	}
		
}
