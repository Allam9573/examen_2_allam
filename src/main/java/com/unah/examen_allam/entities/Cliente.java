package com.unah.examen_allam.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "cliente")
public class Cliente {

    @Id
    private String dni;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;

}
