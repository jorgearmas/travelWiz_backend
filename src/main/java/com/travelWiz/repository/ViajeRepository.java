package com.travelWiz.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travelWiz.entity.Viaje;

@Repository("viajeRepository")
public interface ViajeRepository extends JpaRepository<Viaje, Integer> {
	
	public List<Viaje> findByIdestado(int idestado);
	
}
