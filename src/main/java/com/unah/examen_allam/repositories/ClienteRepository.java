package com.unah.examen_allam.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.unah.examen_allam.entities.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, String> {

}
