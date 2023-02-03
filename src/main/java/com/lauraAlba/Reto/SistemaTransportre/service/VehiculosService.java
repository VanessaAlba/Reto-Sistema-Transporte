package com.lauraAlba.Reto.SistemaTransportre.service;

import com.lauraAlba.Reto.SistemaTransportre.repository.Terminal;
import com.lauraAlba.Reto.SistemaTransportre.repository.modelos.Aerovan;
import com.lauraAlba.Reto.SistemaTransportre.repository.modelos.Bus;
import com.lauraAlba.Reto.SistemaTransportre.repository.modelos.Vehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VehiculosService implements IVehiculosService{

    @Autowired
    private Terminal terminalFusagasuga;

    @Override
    public List<Vehiculo> obtenerVehiculos() {
        return this.terminalFusagasuga.getVehiculos();
    }

    @Override
    public Vehiculo agregarBus(Bus busEntrada) {
        Bus newBus = busEntrada;
        this.terminalFusagasuga.agregarVehiculo(newBus);
        return newBus;
    }

    @Override
    public Vehiculo agregarAerovan(Aerovan aerovanEntrada) {
        Aerovan newAerovan = aerovanEntrada;
        this.terminalFusagasuga.agregarVehiculo(newAerovan);
        return newAerovan;
    }
}
