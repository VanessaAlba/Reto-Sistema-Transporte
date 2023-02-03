package com.lauraAlba.Reto.SistemaTransportre.service;

import com.lauraAlba.Reto.SistemaTransportre.repository.modelos.Bus;

import java.util.List;

public interface IBusService {
    List<Bus> obtenerVehiculos ();
    Bus agregarBus (Bus busEntrada);

}
