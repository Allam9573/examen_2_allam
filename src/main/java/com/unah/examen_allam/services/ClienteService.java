package com.unah.examen_allam.services;

import java.util.List;
import java.util.Optional;

import com.unah.examen_allam.entities.Cliente;

public interface ClienteService {

    public String crearCliente(Cliente cliente);

    public List<Cliente> listarClientes();

    public Optional<Cliente> findByDni(String dni);

}
