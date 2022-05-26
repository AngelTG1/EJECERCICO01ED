package com.upchiapas.gastronimia.modelos;

public class Postre {
    private String nombre;
    private String ingredientes;
    private int folio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public Postre(String nombre, String ingredientes, int folio) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.folio = folio;
    }

    @Override
    public String toString() {
        return "Postre{" +
                "nombre='" + nombre + '\'' +
                ", ingredientes='" + ingredientes + '\'' +
                ", folio=" + folio +
                '}';
    }
}
