package com.travelWiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travelWiz.entity.Lugar;

@Repository("lugarRepository")
public interface LugarRepository extends JpaRepository<Lugar, Integer> {
	
}
