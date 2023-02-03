package com.lauraAlba.Reto.SistemaTransportre.service;

import com.lauraAlba.Reto.SistemaTransportre.repository.modelos.Viaje;

import java.util.List;

public interface IViajeService {
    List<Viaje> obtenerViajes();

    Viaje agregarViaje(Viaje viajeEntrada);
}
