package com.unah.examen_allam.entities;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "cuentas")
public class Cuenta {

    @Id
    @Column(name = "numerocuenta")
    private String numeroCuenta;
    private double saldo;
    @Column(name = "fechaapertura")
    private LocalDate fechaApertura;
    @Column(columnDefinition = "tinyint")
    private boolean estado;
    @Column(columnDefinition = "tinyint")
    private boolean sobregiro;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dni", referencedColumnName = "dni")
    private Cliente cliente;
    
}
