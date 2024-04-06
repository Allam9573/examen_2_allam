package com.unah.examen_allam.services.impl;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unah.examen_allam.entities.Cuenta;
import com.unah.examen_allam.repositories.CuentaRepository;
import com.unah.examen_allam.services.CuentaService;

@Service
public class CuentaServiceImpl implements CuentaService {

    @Autowired
    private CuentaRepository cuentaRepository;

    @Override
    public Cuenta crearCuenta(Cuenta cuenta) {
        // Cuenta existeCuenta =
        // this.cuentaRepository.findById(cuenta.getNumeroCuenta()).get();
        // if (null != existeCuenta) {
        // return null;
        // }

        if (cuenta.getSaldo() >= 500) {
            cuenta.setEstado(true);
            cuenta.setFechaApertura(LocalDate.now());
            this.cuentaRepository.save(cuenta);
        }
        System.out.println(cuenta.getFechaApertura());
        return cuenta;
    }

}