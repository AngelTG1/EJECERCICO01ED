package com.upchiapas.gastronimia.modelos;

public class Participante {
    private String nombre;
    private int folio;
    private String lugar;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }



    public Participante(String nombre, String lugar, int folio) {
        this.nombre = nombre;
        this.folio = folio;
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return "Participante{" +
                "nombre='" + nombre + '\'' +
                ", folio=" + folio +
                ", lugar='" + lugar + '\'' +
                '}';
    }



}
