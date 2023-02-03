package com.lauraAlba.Reto.SistemaTransportre.repository;

import com.lauraAlba.Reto.SistemaTransportre.repository.modelos.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class Terminal {
    private List<Vehiculo> listaVehiculos;
    private List<Destino> listaDestinos;

    private List<Viaje> listaViajes;

    public Terminal() {
        misVehiculos();
        misDestinos();
        misViajes();
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

    public List<Viaje> getViajes(){
        return listaViajes;
    }

    public void agregarViaje(Viaje nuevoViaje){
        this.listaViajes.add(nuevoViaje);
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

    private void misViajes() {
        listaViajes = new ArrayList<>(List.of(
                new Viaje("1", new Destino("1", "Bogota"), "03-02-2021", "10:00", new Bus("1", 0, 30)),
                new Viaje("2", new Destino("2", "Fusa"), "15-02-2021", "10:00", new Bus("4", 0, 15))
        ));
    }




}
