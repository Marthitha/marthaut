package com.example.marthitha.estacionamiento.Modelo;

import java.util.Date;

/**
 * Created by Marthitha on 18/02/2018.
 */

public class Incidencia {
    public String descripcion;
    public Date fecha;
    public Date hora;

    public void registrarIncidencia(){};

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Date getHora() {
        return hora;
    }
}
