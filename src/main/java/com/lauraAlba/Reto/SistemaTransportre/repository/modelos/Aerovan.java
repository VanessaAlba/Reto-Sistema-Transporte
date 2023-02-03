package com.lauraAlba.Reto.SistemaTransportre.repository.modelos;

public class Aerovan extends Vehiculo{
    public Aerovan(String placa) {
        super(placa);
        setCantidadPasajeros(15);
        setPuestosDisposibles(getPuestosDisposibles());
    }
}
