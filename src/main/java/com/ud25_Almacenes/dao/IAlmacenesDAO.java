package com.ud25_Almacenes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ud25_Almacenes.dto.Almacenes;


public interface IAlmacenesDAO extends JpaRepository<Almacenes,Integer>{

}
