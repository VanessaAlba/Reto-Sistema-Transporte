package com.lauraAlba.Reto.SistemaTransportre.repository.modelos;

public class Bus {
    private String placa;
    private int cantidadPasajeros;
    private int puestosDisposibles;


    public Bus(String placa, int cantidadPasajeros, int puestosDisposibles) {
        this.placa = placa;
        this.cantidadPasajeros = cantidadPasajeros;
        this.puestosDisposibles = puestosDisposibles;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getPuestosDisposibles() {
        return puestosDisposibles;
    }

    public void setPuestosDisposibles(int puestosDisposibles) {
        this.puestosDisposibles = puestosDisposibles;
    }

    public void disminuirPuestos() {
        this.puestosDisposibles = puestosDisposibles - 1;
    }

}
