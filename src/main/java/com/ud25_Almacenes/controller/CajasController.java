package com.ud25_Almacenes.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ud25_Almacenes.dto.Cajas;
import com.ud25_Almacenes.service.CajasServiceImpl;

@RestController
@RequestMapping("/api")
public class CajasController {

	@Autowired
	CajasServiceImpl cajasServiceImpl;
	
	@GetMapping("/cajas")
	public List<Cajas> listCajas(){
		return cajasServiceImpl.listCajas();
	}
	
	@GetMapping("/cajas/{num_ref}")
	public Cajas findByNumRef(@PathVariable(name="num_ref") String numRef) {
		return cajasServiceImpl.findByNumRef(numRef);
	}
	
	@GetMapping("/cajas/almacenes/{almacen}")
	public List<Cajas> findByAlmacen(@PathVariable(name="almacen")int idAlmacen){
		return cajasServiceImpl.findByAlmacen(idAlmacen);
	}
	
	@DeleteMapping("/cajas/{num_ref}")
	@Transactional
	public void deleteCaja(@PathVariable(name="num_ref") String numRef) {
		cajasServiceImpl.deleteCaja(numRef);
	}
	
	@PostMapping("/cajas")
	public String saveCaja(@RequestBody Cajas caja) {
		boolean exists = false;
		
		for (Cajas c : cajasServiceImpl.listCajas()) {
			if(c.getNum_ref().equals(caja.getNum_ref())) {
				exists = true;
			}
		}
		if(!exists) {
			cajasServiceImpl.saveCaja(caja);
			return "Caja "+ caja.getNum_ref()+" guardada!";
		}
		return "Caja existente";	
	}
	
	@PutMapping("/cajas/{num_ref}")
	public Cajas updateCaja(@PathVariable(name="num_ref") String numRef, @RequestBody Cajas caja) {
		Cajas caja_selec = cajasServiceImpl.findByNumRef(numRef);
		
		caja_selec.setValor(caja.getValor());
		caja_selec.setAlmacen(caja.getAlmacen());
		
		return cajasServiceImpl.saveCaja(caja_selec);
	}
	
}
