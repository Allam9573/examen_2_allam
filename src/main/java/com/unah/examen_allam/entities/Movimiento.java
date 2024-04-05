package com.unah.examen_allam.entities;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "movimientos")
public class Movimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmovimiento")
    private int idMovimiento;
    @Column(name = "tipomovimiento")
    private char tipoMovimiento;
    private double monto;
    @Column(name = "fechamovimiento")
    private LocalDate fechaMovimiento;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "numerocuenta", referencedColumnName = "numerocuenta")
    private Cuenta cuenta;

}
