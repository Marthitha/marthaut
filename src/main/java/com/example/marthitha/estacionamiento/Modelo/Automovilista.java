package com.example.marthitha.estacionamiento.Modelo;

/**
 * Created by Marthitha on 18/02/2018.
 */

public class Automovilista extends Usuario {
    public String licencia;
    public String tarjetaAcceso;

    public Automovilista(String nombre, String apellido, String correo, String vehiculo, int telefono) {
        super(nombre, apellido, correo, vehiculo, telefono);
    }


    public String getLicencia() {
        return licencia;
    }

    public String getTarjetaAcceso() {
        return tarjetaAcceso;
    }

}