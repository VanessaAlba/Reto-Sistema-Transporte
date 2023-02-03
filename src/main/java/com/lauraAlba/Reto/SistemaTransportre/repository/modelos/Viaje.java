package com.lauraAlba.Reto.SistemaTransportre.repository.modelos;

import java.util.ArrayList;
import java.util.List;

public class Viaje {
    private String numeroViaje;
    private List<Ticket> pasajes;
    private Destino destino;
    private String fecha;
    private String hora;
    private Bus vehiculo;


    public Viaje(String numeroViaje,Destino destino, String fecha, String hora, Bus vehiculo) {
        this.numeroViaje= numeroViaje;
        this.destino = destino;
        this.fecha = fecha;
        this.hora = hora;
        this.vehiculo = vehiculo;
        this.pasajes = new ArrayList<>();
    }

    public String getNumeroViaje() {
        return numeroViaje;
    }

    public void setNumeroViaje(String numeroViaje) {
        this.numeroViaje = numeroViaje;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Bus getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Bus vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void agregarPasaje(Ticket ticketEntrada){
        this.pasajes.add(ticketEntrada);
    }
}
