package com.unah.examen_allam.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.unah.examen_allam.entities.Movimiento;
import com.unah.examen_allam.services.impl.MovimientoServiceImpl;

@RestController
@RequestMapping("/api/movimientos")
public class MovimientoController {

    @Autowired
    private MovimientoServiceImpl movimientoServiceImpl;

    @PostMapping("/crear")
    public Movimiento crearMovimiento(@RequestBody Movimiento movimiento) {
        return this.movimientoServiceImpl.crearMovimiento(movimiento);
    }
    
    @GetMapping("/movimientos-por-cuenta")
    public Optional<Movimiento> obtenerMovimientosPorCuenta(@RequestParam String numero){
        return this.movimientoServiceImpl.obtenerMovimientoPorCuenta(numero);
    }
}
