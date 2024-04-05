package com.unah.examen_allam.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unah.examen_allam.entities.Cliente;
import com.unah.examen_allam.services.impl.ClienteServiceImpl;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @PostMapping("/crear")
    public String crearCliente(@RequestBody Cliente cliente) {
        return this.clienteServiceImpl.crearCliente(cliente);
    }

    @GetMapping({ "", "/" })
    public List<Cliente> listarClientes() {
        return this.clienteServiceImpl.listarClientes();
    }

    @GetMapping("/buscar/{dni}")
    public Optional<Cliente> buscarPorDni(@PathVariable String dni) {
        return this.clienteServiceImpl.findByDni(dni);
    }

}
