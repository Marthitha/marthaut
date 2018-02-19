package com.example.marthitha.estacionamiento.Modelo;

import java.util.Date;

/**
 * Created by Marthitha on 18/02/2018.
 */

public class Acceso {
    public Date fecha;
    public Date horaEntrada;
    public Date horaSalida;
    public int codigoTarjeta;
    public String guardiaEntrada;
    public String guardiaSalida;

    public void registrarEntrada(){};
    public void registrarSalida(){};

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public void setCodigoTarjeta(int codigoTarjeta) {
        this.codigoTarjeta = codigoTarjeta;
    }

    public void setGuardiaEntrada(String guardiaEntrada) {
        this.guardiaEntrada = guardiaEntrada;
    }

    public void setGuardiaSalida(String guardiaSalida) {
        this.guardiaSalida = guardiaSalida;
    }

    public Date getFecha() {
        return fecha;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public int getCodigoTarjeta() {
        return codigoTarjeta;
    }

    public String getGuardiaEntrada() {
        return guardiaEntrada;
    }

    public String getGuardiaSalida() {
        return guardiaSalida;
    }
}
