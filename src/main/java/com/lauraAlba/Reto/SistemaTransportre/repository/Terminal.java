package com.lauraAlba.Reto.SistemaTransportre.repository;

import com.lauraAlba.Reto.SistemaTransportre.repository.modelos.Aerovan;
import com.lauraAlba.Reto.SistemaTransportre.repository.modelos.Bus;
import com.lauraAlba.Reto.SistemaTransportre.repository.modelos.Destino;
import com.lauraAlba.Reto.SistemaTransportre.repository.modelos.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class Terminal {
    private List<Vehiculo> listaVehiculos;
    private List<Destino> listaDestinos;

    public Terminal() {
        misVehiculos();
    }

    public void agregarVehiculo(Vehiculo vehiculoEntrada){
        listaVehiculos.add(vehiculoEntrada);
    }

    private void misVehiculos(){
        listaVehiculos = new ArrayList<>(List.of(
                new Bus("1"),
                new Bus("2"),
                new Bus("3"),
                new Aerovan("4"),
                new Aerovan("5"),
                new Aerovan("6")
        ));
    }

    private  void misDestinos(){

    }

}
