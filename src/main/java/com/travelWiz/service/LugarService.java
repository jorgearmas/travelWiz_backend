package com.travelWiz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travelWiz.entity.Lugar;
import com.travelWiz.repository.LugarRepository;

@RestController
@RequestMapping("/lugar")
@CrossOrigin
public class LugarService {
	@Autowired
	LugarRepository lugarRepository;
	
	@GetMapping(path = "/buscar")
	public List<Lugar> buscar(){
		return lugarRepository.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Lugar guardar(@RequestBody Lugar lugar) {
		return lugarRepository.save(lugar);
	}
	
	@DeleteMapping(path="/eliminar/{idlugar}")
	public void eliminar(@PathVariable("idlugar") int idlugar){
		lugarRepository.deleteById(idlugar);	
	}
}
