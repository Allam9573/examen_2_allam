package com.unah.examen_allam.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unah.examen_allam.entities.Cuenta;
import com.unah.examen_allam.services.impl.CuentaServiceImpl;


@RestController
@RequestMapping("/api/cuentas")
public class CuentaController {

    @Autowired
    private CuentaServiceImpl cuentaServiceImpl;

    @PostMapping("/crear")
    public Cuenta crearCuenta(@RequestBody Cuenta cuenta){
        return this.cuentaServiceImpl.crearCuenta(cuenta);
    }
    
}
