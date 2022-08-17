package com.ud25_Almacenes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ud25_Almacenes.dto.Almacenes;
import com.ud25_Almacenes.service.AlmacenesServiceImpl;

@RestController
@RequestMapping("/api")
public class AlmacenesController {

	@Autowired
	AlmacenesServiceImpl almacServImpl;
	
	@GetMapping("/almacenes")
	public List<Almacenes> listAlmacenes(){
		return almacServImpl.listAlmacenes();
	}
		
	@GetMapping("/almacenes/{id}")
	public Almacenes findById(@PathVariable(name="id") int id) {
		return almacServImpl.findById(id);
	}
	
	@DeleteMapping("/almacenes/{id}")
	public void deleteAlmacen(@PathVariable(name="id") int id) {
		almacServImpl.deleteAlmacen(id);
	}
	
	@PostMapping("/almacenes")
	public Almacenes saveAlmacen(@RequestBody Almacenes almacen) {
		return almacServImpl.saveAlmacen(almacen);
	}
	
	@PutMapping("/almacenes/{id}") //actualizar
	public Almacenes updateAlmacen(@PathVariable(name="id") int id, @RequestBody Almacenes almacen) {
		Almacenes almac_selec = almacServImpl.findById(id);
		
		almac_selec.setLugar(almacen.getLugar());
		almac_selec.setCapacidad(almacen.getCapacidad());
				
		return almacServImpl.saveAlmacen(almac_selec);
	}
		
}
