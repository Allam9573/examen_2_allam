package com.unah.examen_allam.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unah.examen_allam.entities.Direccion;
import com.unah.examen_allam.services.impl.DireccionServiceImpl;

@RestController
@RequestMapping("/api/direcciones")
public class DireccionController {

    @Autowired
    private DireccionServiceImpl direccionServiceImpl;

    @PostMapping("/crear")
    public Direccion crearDireccion(@RequestBody Direccion direccion, @PathVariable String dni) {
        return this.direccionServiceImpl.crearDireccion(direccion, dni);
    }
}
