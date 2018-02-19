package com.example.marthitha.estacionamiento.Modelo;

/**
 * Created by Marthitha on 18/02/2018.
 */

public class Vehiculo {
    public String placas;
    public String marca;
    public String color;
    public String modelo;

    public  void registarVehiculo (){};

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlacas() {
        return placas;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public String getModelo() {
        return modelo;
    }
}
