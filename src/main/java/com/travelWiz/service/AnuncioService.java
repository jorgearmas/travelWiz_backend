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

import com.travelWiz.entity.Anuncio;
import com.travelWiz.repository.AnuncioRepository;

@RestController
@RequestMapping("/anuncio")
@CrossOrigin
public class AnuncioService {
	@Autowired
	AnuncioRepository anuncioRepository;
	
	@GetMapping(path = "/buscar")
	public List<Anuncio> buscar(){
		return anuncioRepository.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Anuncio guardar(@RequestBody Anuncio anuncio) {
		return anuncioRepository.save(anuncio);
	}
	
	@DeleteMapping(path="/eliminar/{idanuncio}")
	public void eliminar(@PathVariable("idanuncio") int idanuncio){
		anuncioRepository.deleteById(idanuncio);	
	}
}

