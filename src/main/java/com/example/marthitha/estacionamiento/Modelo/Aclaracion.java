package com.example.marthitha.estacionamiento.Modelo;

import java.util.Date;

/**
 * Created by Marthitha on 18/02/2018.
 */

public class Aclaracion {
    private Date fecha;
    private  String descripcion;

    private int noIncidencia(){
        return 0;
    };
    private void registrarAclaracion(){};

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
