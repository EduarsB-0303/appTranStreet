package com.example.apptransstreet.dto;
public class Micro {
    private String nombre_linea;
    private int tarifa_n_linea;
    private int tarifa_e_linea;
    private String  nombre_ruta;

    public Micro() {

    }

    public Micro(String nombre_linea, int tarifa_n_linea, int tarifa_e_linea, String nombre_ruta) {
        this.nombre_linea = nombre_linea;
        this.tarifa_n_linea = tarifa_n_linea;
        this.tarifa_e_linea = tarifa_e_linea;
        this.nombre_ruta = nombre_ruta;
    }

    public String getNombre_linea() {
        return nombre_linea;
    }

    public void setNombre_linea(String nombre_linea) {
        this.nombre_linea = nombre_linea;
    }

    public int getTarifa_n_linea() {
        return tarifa_n_linea;
    }

    public void setTarifa_n_linea(int tarifa_n_linea) {
        this.tarifa_n_linea = tarifa_n_linea;
    }

    public int getTarifa_e_linea() {
        return tarifa_e_linea;
    }

    public void setTarifa_e_linea(int tarifa_e_linea) {
        this.tarifa_e_linea = tarifa_e_linea;
    }

    public String getNombre_ruta() {
        return nombre_ruta;
    }

    public void setNombre_ruta(String nombre_ruta) {
        this.nombre_ruta = nombre_ruta;
    }
}

