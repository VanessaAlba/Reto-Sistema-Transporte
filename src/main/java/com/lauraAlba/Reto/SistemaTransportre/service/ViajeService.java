package com.lauraAlba.Reto.SistemaTransportre.service;

import com.lauraAlba.Reto.SistemaTransportre.repository.Terminal;
import com.lauraAlba.Reto.SistemaTransportre.repository.modelos.Viaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViajeService implements IViajeService{
    @Autowired
    private Terminal terminalFusagasuga;

    @Override
    public List<Viaje> obtenerViajes() {
        return terminalFusagasuga.getViajes();
    }

    @Override
    public Viaje agregarViaje(Viaje viajeEntrada) {
        Viaje newViaje = new Viaje(viajeEntrada.getNumeroViaje(), viajeEntrada.getDestino(), viajeEntrada.getFecha(), viajeEntrada.getHora(), viajeEntrada.getVehiculo());
        this.terminalFusagasuga.agregarViaje(newViaje);
        return  newViaje;
    }
}
