package com.example.marthitha.estacionamiento.Modelo;

/**
 * Created by Marthitha on 18/02/2018.
 */

public class Alumno extends Automovilista {
    public int noControl;
    public String grupo;

    public Alumno(String licencia, String tarjetaAcceso) {
        super(licencia, tarjetaAcceso);
    }

    public void setNoControl(int noControl) {
        this.noControl = noControl;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public int getNoControl() {
        return noControl;
    }

    public String getGrupo() {
        return grupo;
    }
}
