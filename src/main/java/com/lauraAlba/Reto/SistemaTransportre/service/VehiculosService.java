package com.lauraAlba.Reto.SistemaTransportre.service;

import com.lauraAlba.Reto.SistemaTransportre.repository.Terminal;
import com.lauraAlba.Reto.SistemaTransportre.repository.modelos.Vehiculo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class VehiculosService implements IVehiculosService{

    @Autowired
    private Terminal terminalFusagasuga;

    @Override
    public List<Vehiculo> obtenerVehiculos() {
        return this.terminalFusagasuga.getVehiculos();
    }

    @Override
    public Vehiculo agregarVehiculo(Vehiculo vehiculoEntrada) {
        Vehiculo newVehiculo = vehiculoEntrada;
        this.terminalFusagasuga.agregarVehiculo(newVehiculo);
        return newVehiculo;
    }
}
