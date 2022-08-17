package com.ud25_Almacenes.service;

import java.util.List;

import com.ud25_Almacenes.dto.Almacenes;

public interface IAlmacenesService {
	//CRUD
	public List<Almacenes> listAlmacenes(); // GET ALL
	
	public Almacenes saveAlmacen(Almacenes almacen); // CREATE || UPDATE
	
	public Almacenes findById(int id); // GET BY ID
	
	public void deleteAlmacen(int id); //DELETE
	
}
