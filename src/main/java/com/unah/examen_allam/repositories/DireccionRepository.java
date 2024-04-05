package com.unah.examen_allam.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.unah.examen_allam.entities.Direccion;

@Repository
public interface DireccionRepository extends CrudRepository<Direccion, Integer> {

}
