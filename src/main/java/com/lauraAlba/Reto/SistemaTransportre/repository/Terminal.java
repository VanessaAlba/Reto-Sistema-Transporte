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
        misDestinos();
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
        listaDestinos = new ArrayList<>(List.of(
                new Destino("1","Bogota"),
                new Destino("2","Fusa"),
                new Destino("3","Melgar"),
                new Destino("4","Girardot")
        ));

    }
    public List<Vehiculo> getVehiculos(){
        return  listaVehiculos;
    }
    public void agregarVehiculo(Vehiculo vehiculoEntrada){

        listaVehiculos.add(vehiculoEntrada);
    }

    public List<Destino> getDestinos(){
        return listaDestinos;
    }

    public void agregarDestino(Destino nuevoDestino){
        listaDestinos.add(nuevoDestino);
    }



}
