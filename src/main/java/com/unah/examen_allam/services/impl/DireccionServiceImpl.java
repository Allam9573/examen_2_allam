package com.unah.examen_allam.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unah.examen_allam.entities.Cliente;
import com.unah.examen_allam.entities.Direccion;
import com.unah.examen_allam.repositories.ClienteRepository;
import com.unah.examen_allam.repositories.DireccionRepository;
import com.unah.examen_allam.services.DireccionService;

@Service
public class DireccionServiceImpl implements DireccionService {

    @Autowired
    private DireccionRepository direccionRepository;
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Direccion crearDireccion(Direccion direccion, String dni) {
        Cliente existeCliente = this.clienteRepository.findById(dni).get();
        Direccion existeDireccion = this.direccionRepository.findById(direccion.getIdDireccion()).get();
        if (null != existeCliente) {
            existeDireccion.setCliente(existeCliente);
            this.direccionRepository.save(direccion);
        }
        return null;
    }

}
