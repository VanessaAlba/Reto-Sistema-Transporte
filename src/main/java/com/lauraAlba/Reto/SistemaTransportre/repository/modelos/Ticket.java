package com.lauraAlba.Reto.SistemaTransportre.repository.modelos;

public class Ticket {
    private String numTicket;
    private Pasajero pasajero;

    public Ticket(String numTicket, Pasajero pasajero) {
        this.numTicket = numTicket;
        this.pasajero = pasajero;
    }

    public String getNumTicket() {
        return numTicket;
    }

    public void setNumTicket(String numTicket) {
        this.numTicket = numTicket;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }
}
