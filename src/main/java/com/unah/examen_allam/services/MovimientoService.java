package com.unah.examen_allam.services;

import java.util.Optional;

import com.unah.examen_allam.entities.Movimiento;

public interface MovimientoService {

    public Movimiento crearMovimiento(Movimiento movimiento);

    public Optional<Movimiento> obtenerMovimientoPorCuenta(String numeroCuenta);

}
