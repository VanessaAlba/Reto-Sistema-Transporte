package com.lauraAlba.Reto.SistemaTransportre.repository;

import com.lauraAlba.Reto.SistemaTransportre.repository.modelos.Aerovan;
import com.lauraAlba.Reto.SistemaTransportre.repository.modelos.Bus;
import com.lauraAlba.Reto.SistemaTransportre.repository.modelos.Destino;
import com.lauraAlba.Reto.SistemaTransportre.repository.modelos.Vehiculo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class Terminal {
    private List<Vehiculo> listaVehiculos;
    private List<Destino> listaDestinos;

    public Terminal() {
        misVehiculos();
        misDestinos();
    }

    private void misVehiculos(){
        listaVehiculos = new ArrayList<>(List.of(
                new Bus("1",30,30),
                new Bus("2",30,30),
                new Bus("3",30,30),
                new Aerovan("4",15,15),
                new Aerovan("5",15,15),
                new Aerovan("6",15,15)
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
