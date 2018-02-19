package com.example.marthitha.estacionamiento.Modelo;

/**
 * Created by Marthitha on 18/02/2018.
 */

public class Usuario {
    public String nombre;
    public String apellido;
    public String correo;
    public String vehiculo;
    public int telefono;

    public Usuario(String nombre, String apellido, String correo, String vehiculo, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.vehiculo = vehiculo;
        this.telefono = telefono;
    }

    public void registrarUsuario(){};

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public int getTelefono() {
        return telefono;
    }

}
