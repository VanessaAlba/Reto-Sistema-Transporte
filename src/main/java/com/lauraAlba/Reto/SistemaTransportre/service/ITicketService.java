package com.lauraAlba.Reto.SistemaTransportre.service;

import com.lauraAlba.Reto.SistemaTransportre.repository.modelos.Pasajero;
import com.lauraAlba.Reto.SistemaTransportre.repository.modelos.Ticket;
import com.lauraAlba.Reto.SistemaTransportre.repository.modelos.Viaje;

public interface ITicketService {
    Ticket crearTicket(Pasajero pasajero, Viaje viaje);
}
