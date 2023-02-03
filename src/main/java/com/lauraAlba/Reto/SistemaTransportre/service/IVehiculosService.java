package com.lauraAlba.Reto.SistemaTransportre.service;

import com.lauraAlba.Reto.SistemaTransportre.repository.modelos.Vehiculo;

import java.util.List;

public interface IVehiculosService {
    List<Vehiculo> obtenerVehiculos ();
    Vehiculo agregarVehiculo (Vehiculo vehiculoEntrada);
}
