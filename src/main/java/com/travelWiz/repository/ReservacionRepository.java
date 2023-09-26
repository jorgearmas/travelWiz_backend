package com.travelWiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travelWiz.entity.Reservacion;

@Repository("reservacionRepository")
public interface ReservacionRepository extends JpaRepository<Reservacion, Integer> {

}
