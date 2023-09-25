package com.travelWiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("anuncio")
public interface Anuncio extends JpaRepository<Anuncio, Integer>{

}
