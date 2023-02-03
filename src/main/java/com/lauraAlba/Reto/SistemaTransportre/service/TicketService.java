package com.lauraAlba.Reto.SistemaTransportre.service;

import com.lauraAlba.Reto.SistemaTransportre.repository.Terminal;
import com.lauraAlba.Reto.SistemaTransportre.repository.modelos.Pasajero;
import com.lauraAlba.Reto.SistemaTransportre.repository.modelos.Ticket;
import com.lauraAlba.Reto.SistemaTransportre.repository.modelos.Viaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TicketService implements ITicketService{
    @Autowired
    private Terminal terminalFusagasuga;


    @Override
    public Ticket crearTicket(Pasajero pasajero, Viaje viaje) {
        Pasajero pasajeroEntrada = terminalFusagasuga.getPasajero(pasajero.getCedula());
        Ticket newTicket = new Ticket(UUID.randomUUID().toString(), new Pasajero(pasajeroEntrada.getCedula(),pasajeroEntrada.getNombre()));

        Viaje viajeEntrada = terminalFusagasuga.getViaje(viaje.getNumeroViaje());
        viajeEntrada.agregarPasaje(newTicket);

        return newTicket;
    }
}
