package com.lauraAlba.Reto.SistemaTransportre.repository;

import com.lauraAlba.Reto.SistemaTransportre.repository.modelos.Viaje;

import java.util.ArrayList;
import java.util.List;

public class ViajeRepositorio {
    private List<Viaje> viajes;

    public ViajeRepositorio() {
        this.viajes = new ArrayList<>();
    }

    public List<Viaje> obtenerViajes(){
        return  viajes;
    }

    public  void registrarViaje(Viaje viajeEntrada){
        this.viajes.add(viajeEntrada);
    }

}
