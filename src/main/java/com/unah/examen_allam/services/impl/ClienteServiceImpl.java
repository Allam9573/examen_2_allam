package com.unah.examen_allam.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unah.examen_allam.entities.Cliente;
import com.unah.examen_allam.repositories.ClienteRepository;
import com.unah.examen_allam.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public String crearCliente(Cliente cliente) {
        Optional<Cliente> existeCliente = this.clienteRepository.findById(cliente.getDni());
        if (null != existeCliente) {
            return "Este cliente ya tiene un registro";
        }
        this.clienteRepository.save(cliente);
        return "Cliente registrado";
    }

    @Override
    public List<Cliente> listarClientes() {
        return (List<Cliente>) this.clienteRepository.findAll();
    }

    @Override
    public Optional<Cliente> findByDni(String dni) {
        return this.clienteRepository.findById(dni);
    }

}
