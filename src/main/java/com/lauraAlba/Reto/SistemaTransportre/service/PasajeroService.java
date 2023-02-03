package com.lauraAlba.Reto.SistemaTransportre.service;

import com.lauraAlba.Reto.SistemaTransportre.repository.Terminal;
import com.lauraAlba.Reto.SistemaTransportre.repository.modelos.Pasajero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PasajeroService implements IPasajeroService {

    @Autowired
    private Terminal terminalFusagasuga;

    @Override
    public List<Pasajero> obtenerPasajeros() {
        return this.terminalFusagasuga.getPasajeros();
    }

    @Override
    public Pasajero agregarPasajero(Pasajero pasajeroEntrada) {
        Pasajero newPasajero = new Pasajero(pasajeroEntrada.getCedula(), pasajeroEntrada.getNombre());
        this.terminalFusagasuga.agregarPasajero(newPasajero);
        return  newPasajero;
    }


}
