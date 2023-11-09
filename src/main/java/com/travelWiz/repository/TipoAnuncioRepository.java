package com.travelWiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travelWiz.entity.TipoAnuncio;

@Repository("tipoAnuncioRepository")
public interface TipoAnuncioRepository extends JpaRepository<TipoAnuncio, Integer> {

}
