package com.lauraAlba.Reto.SistemaTransportre.service;

import com.lauraAlba.Reto.SistemaTransportre.repository.modelos.Destino;

import java.util.List;

public interface IDestinoService {
    List<Destino> obtenerDestinos();
    Destino agregarDestino (Destino nuevoDestino);
}
