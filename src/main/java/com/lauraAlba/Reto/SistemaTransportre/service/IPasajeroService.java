package com.lauraAlba.Reto.SistemaTransportre.service;

import com.lauraAlba.Reto.SistemaTransportre.repository.modelos.Pasajero;

import java.util.List;

public interface IPasajeroService {

    List<Pasajero> obtenerPasajeros();

    Pasajero agregarPasajero(Pasajero pasajeroEntrada);
}
