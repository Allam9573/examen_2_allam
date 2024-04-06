package com.unah.examen_allam.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unah.examen_allam.entities.Cuenta;
import com.unah.examen_allam.entities.Movimiento;
import com.unah.examen_allam.repositories.CuentaRepository;
import com.unah.examen_allam.repositories.MovimientoRepository;
import com.unah.examen_allam.services.MovimientoService;

@Service
public class MovimientoServiceImpl implements MovimientoService {

    @Autowired
    private MovimientoRepository movimientoRepository;
    @Autowired
    private CuentaRepository cuentaRepository;

    @Override
    public Optional<Movimiento> obtenerMovimientoPorCuenta(String numeroCuenta) {
        return this.movimientoRepository.findByCuenta(numeroCuenta);
    }

    @Override
    public Movimiento crearMovimiento(Movimiento movimiento) {
        Cuenta existeCuenta = this.cuentaRepository.findById(movimiento.getCuenta().getNumeroCuenta()).get();
        if ((null != existeCuenta) && existeCuenta.isEstado() == true) {
            if (movimiento.getTipoMovimiento() == 'C') {
                existeCuenta.setSaldo(existeCuenta.getSaldo() + movimiento.getMonto());
            } else if (movimiento.getTipoMovimiento() == 'D') {
                if (existeCuenta.getSaldo() >= 0) {
                    existeCuenta.setSaldo(existeCuenta.getSaldo() - movimiento.getMonto());
                } else {
                    if (existeCuenta.isSobregiro() == true) {
                        existeCuenta.setSaldo(existeCuenta.getSaldo() - movimiento.getMonto());
                        
                    }
                }
            }
        }
        throw new UnsupportedOperationException("Unimplemented method 'crearMovimiento'");
    }

}
