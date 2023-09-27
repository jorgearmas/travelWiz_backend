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

import com.travelWiz.entity.Usuario;
import com.travelWiz.repository.UsuarioRepository;



@RestController
@RequestMapping("/usuario")
@CrossOrigin
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@GetMapping(path = "/buscar")
	public List<Usuario> buscar(){
		return usuarioRepository.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Usuario guardar(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	@DeleteMapping(path="/eliminar/{correo}")
	public void eliminar(@PathVariable("correo") String correo){
		usuarioRepository.deleteById(correo);	
	}
	
	//Service - Login
	@PostMapping(path = "/login")
	public Usuario findByCorreoAndPassword(@RequestBody Usuario usuario) {
		
		List<Usuario> listaUsuarios = usuarioRepository.findByCorreoAndPassword(usuario.getCorreo(), usuario.getPassword());
		
		Usuario usuarioRetorno = null;
		if(!listaUsuarios.isEmpty()) {
			usuarioRetorno = listaUsuarios.get(0);
		}
		
		return usuarioRetorno;
	}
}
