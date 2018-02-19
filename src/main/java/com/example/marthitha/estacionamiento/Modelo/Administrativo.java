package com.example.marthitha.estacionamiento.Modelo;

/**
 * Created by Marthitha on 18/02/2018.
 */

public class Administrativo extends Usuario {
    private String departamento;


    public Administrativo(String nombre, String apellido, String correo, String vehiculo, int telefono) {
        super(nombre, apellido, correo, vehiculo, telefono);
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }
}
