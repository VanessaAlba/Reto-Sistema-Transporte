package com.lauraAlba.Reto.SistemaTransportre.service;

import com.lauraAlba.Reto.SistemaTransportre.repository.Terminal;
import com.lauraAlba.Reto.SistemaTransportre.repository.modelos.Destino;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

public class DestinoService implements IDestinoService{
    @Autowired
    private Terminal terminalFusagasuga;

    @Override
    public List<Destino> obtenerDestinos() {
        return this.terminalFusagasuga.getDestinos();
    }

    @Override
    public Destino agregarDestino(Destino nuevoDestino) {
        Destino newDestino = new Destino(UUID.randomUUID().toString(),nuevoDestino.getNombre());
        this.terminalFusagasuga.agregarDestino(newDestino);
        return newDestino;
    }
}
