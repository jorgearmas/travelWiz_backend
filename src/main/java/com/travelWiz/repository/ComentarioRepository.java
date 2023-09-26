package com.travelWiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travelWiz.entity.Comentario;

@Repository("comentarioRepository")
public interface ComentarioRepository extends JpaRepository<Comentario, Integer>{

}
