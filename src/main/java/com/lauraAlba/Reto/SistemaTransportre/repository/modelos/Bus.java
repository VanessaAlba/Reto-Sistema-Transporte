package com.lauraAlba.Reto.SistemaTransportre.repository.modelos;

public class Bus extends Vehiculo {

    public Bus(String placa) {
        super(placa);
        setCantidadPasajeros(30);
        setPuestosDisposibles(getPuestosDisposibles());
    }

}
