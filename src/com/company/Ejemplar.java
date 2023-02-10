package com.company;

public class Ejemplar {
    String Autor;
    String categoría;
    String ISBN;
    Integer Disponibilidad;

    public Ejemplar(String autor, String categoría, String ISBN, Integer disponibilidad) {
        Autor = autor;
        this.categoría = categoría;
        this.ISBN = ISBN;
        Disponibilidad = disponibilidad;
    }

    public String getAutor() {
        return Autor;
    }

    public String getCategoría() {
        return categoría;
    }

    public String getISBN() {
        return ISBN;
    }

    public Integer getDisponibilidad() {
        return Disponibilidad;
    }
}
