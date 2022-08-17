package com.ud25_Almacenes.service;

import java.util.List;
import com.ud25_Almacenes.dto.Cajas;

public interface ICajasService {

	//CRUD
	public List<Cajas> listCajas(); //GET ALL
	
	public Cajas saveCaja(Cajas caja); //CREATE-UPDATE
	
	public void deleteCaja(String numRef); // DELETE
	
	public Cajas findByNumRef(String numRef); // GET BY ID/NUMREF
	
	public List<Cajas> findByAlmacen(int idAlmacen); //GET LIST CAJAS EN X ALMACEN

}
