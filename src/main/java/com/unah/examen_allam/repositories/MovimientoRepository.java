package com.unah.examen_allam.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.unah.examen_allam.entities.Movimiento;

@Repository
public interface MovimientoRepository extends CrudRepository<Movimiento, Integer> {

}
