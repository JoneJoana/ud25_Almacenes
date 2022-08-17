package com.ud25_Almacenes.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ud25_Almacenes.dto.Cajas;


public interface ICajasDAO extends JpaRepository<Cajas,String>{

	public Cajas findByNumRef(String numRef);
	
	public List<Cajas> findByAlmacen(int idAlmacen);
	
	public void deleteCaja(String numRef);	
	
}
