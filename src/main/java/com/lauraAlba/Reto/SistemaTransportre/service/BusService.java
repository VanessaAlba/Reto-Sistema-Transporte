package com.lauraAlba.Reto.SistemaTransportre.service;

import com.lauraAlba.Reto.SistemaTransportre.repository.Terminal;
import com.lauraAlba.Reto.SistemaTransportre.repository.modelos.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BusService implements IBusService {

    @Autowired
    private Terminal terminalFusagasuga;

    @Override
    public List<Bus> obtenerVehiculos() {
        return this.terminalFusagasuga.getVehiculos();
    }

    @Override
    public Bus agregarBus(Bus busEntrada) {
        Bus newBus = busEntrada;
        this.terminalFusagasuga.agregarVehiculo(newBus);
        return newBus;
    }
}
