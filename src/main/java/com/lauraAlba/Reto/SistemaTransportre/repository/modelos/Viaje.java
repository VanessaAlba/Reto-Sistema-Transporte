package com.lauraAlba.Reto.SistemaTransportre.repository.modelos;

import java.util.ArrayList;
import java.util.List;

public class Viaje {
    private List<Ticket> pasajes;
    private Destino destino;
    private String fecha;
    private String hora;
    private Vehiculo vehiculo;


    public Viaje(Destino destino, String fecha, String hora, Vehiculo vehiculo) {
        this.destino = destino;
        this.fecha = fecha;
        this.hora = hora;
        this.vehiculo = vehiculo;
        this.pasajes = new ArrayList<>();
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

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void agregarPasaje(Ticket ticketEntrada){
        this.pasajes.add(ticketEntrada);
    }
}
