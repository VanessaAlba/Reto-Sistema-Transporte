package com.lauraAlba.Reto.SistemaTransportre.service;

import com.lauraAlba.Reto.SistemaTransportre.repository.modelos.Aerovan;
import com.lauraAlba.Reto.SistemaTransportre.repository.modelos.Bus;
import com.lauraAlba.Reto.SistemaTransportre.repository.modelos.Vehiculo;

import java.util.List;

public interface IVehiculosService {
    List<Vehiculo> obtenerVehiculos ();
    Vehiculo agregarBus (Bus busEntrada);

    Vehiculo agregarAerovan(Aerovan aerovanEntrada);
}
