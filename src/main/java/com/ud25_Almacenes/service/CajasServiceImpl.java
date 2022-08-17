package com.ud25_Almacenes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ud25_Almacenes.dao.ICajasDAO;
import com.ud25_Almacenes.dto.Cajas;

@Service
public class CajasServiceImpl implements ICajasService{
	
	@Autowired
	ICajasDAO iCajasDao;

	@Override
	public List<Cajas> listCajas() {
		return iCajasDao.findAll();
	}

	@Override
	public Cajas saveCaja(Cajas caja) {
		return iCajasDao.save(caja);
	}

	@Override
	public void deleteByNumRef(String numRef) {
		iCajasDao.deleteByNumRef(numRef);
	}

	@Override
	public Cajas findByNumRef(String numRef) {
		return iCajasDao.findByNumRef(numRef);
	}

	@Override
	public List<Cajas> findByAlmacen(int idAlmacen) {
		return iCajasDao.findByAlmacen(idAlmacen);
	}

}
