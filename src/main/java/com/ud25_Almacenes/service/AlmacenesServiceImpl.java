package com.ud25_Almacenes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ud25_Almacenes.dao.IAlmacenesDAO;
import com.ud25_Almacenes.dto.Almacenes;

@Service
public class AlmacenesServiceImpl implements IAlmacenesService{

	@Autowired
	IAlmacenesDAO iAlmacenesDao;
	
	@Override
	public List<Almacenes> listAlmacenes() {
		return iAlmacenesDao.findAll();
	}

	@Override
	public Almacenes saveAlmacen(Almacenes almacen) {
		return iAlmacenesDao.save(almacen);
	}

	@Override
	public Almacenes findById(int id) {
		return iAlmacenesDao.findById(id).get();
	}

	@Override
	public void deleteAlmacen(int id) {
		iAlmacenesDao.deleteById(id);
	}

}
