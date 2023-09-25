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

import com.travelWiz.entity.Administrador;
import com.travelWiz.repository.AdministradorRepository;

@RestController
@RequestMapping("/administrador")
@CrossOrigin

public class AdministradorService {
	
	@Autowired
	AdministradorRepository administradorRepository;
	
	@GetMapping(path="/buscar")
	public List<Administrador> buscar(){
		return administradorRepository.findAll();
	}
	
	@PostMapping(path="/guardar")
	public Administrador guardar(@RequestBody Administrador administrador) {
		return administradorRepository.save(administrador);
	}
	
	@DeleteMapping(path="/eliminar/{usuario}")
	public void eliminar(@PathVariable("usuario") String usuario){
		administradorRepository.deleteById(usuario);
		
	}

}
