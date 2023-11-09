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


import com.travelWiz.entity.TipoAnuncio;
import com.travelWiz.repository.TipoAnuncioRepository;

@RestController
@RequestMapping("/tipoanuncio")
@CrossOrigin
public class TipoAnuncioService {
	@Autowired
	TipoAnuncioRepository tipoAnuncioRepository;
	
	
	@GetMapping(path = "/buscar")
	public List<TipoAnuncio> buscar(){
		return tipoAnuncioRepository.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public TipoAnuncio guardar(@RequestBody TipoAnuncio tipoAnuncio) {
		return tipoAnuncioRepository.save(tipoAnuncio);
	}
	
	@DeleteMapping(path="/eliminar/{idtipoanuncio}")
	public void eliminar(@PathVariable("idtipoanuncio") int idtipoanuncio){
		tipoAnuncioRepository.deleteById(idtipoanuncio);	
	}
	
}
