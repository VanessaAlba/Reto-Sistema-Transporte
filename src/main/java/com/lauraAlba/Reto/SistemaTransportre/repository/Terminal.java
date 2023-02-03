package com.lauraAlba.Reto.SistemaTransportre.repository;

import com.lauraAlba.Reto.SistemaTransportre.repository.modelos.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class Terminal {
    private List<Bus> listaBuses;
    private List<Destino> listaDestinos;

    private List<Viaje> listaViajes;
    private List<Pasajero> listaPasajeros;

    public Terminal() {
        misBuses();
        misDestinos();
        misViajes();
        misPasajeros();
    }

    public List<Bus> getVehiculos(){
        return  listaBuses;
    }
    public void agregarVehiculo(Bus vehiculoEntrada){

        listaBuses.add(vehiculoEntrada);
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

    public List<Pasajero> getPasajeros() {
        return listaPasajeros;
    }

    public void agregarPasajero(Pasajero nuevoPasajero) {
        this.listaPasajeros.add(nuevoPasajero);
    }

    private void misBuses(){
        listaBuses = new ArrayList<>(List.of(
                new Bus("1",30,30),
                new Bus("2",30,30),
                new Bus("3",30,30)
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

    private void misPasajeros() {
        listaPasajeros = new ArrayList<>(List.of(
                new Pasajero("123", "Laura"),
                new Pasajero("345", "Vivian"),
                new Pasajero("678", "Stephany"),
                new Pasajero("491", "Sofia")
        ));
    }

}
