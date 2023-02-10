package com.company;

public class Prestamo {
    String Título;
    String Inicio;
    String Fin;

    public Prestamo(String título, String inicio, String fin) {
        Título = título;
        Inicio = inicio;
        Fin = fin;
    }

    public String getTítulo() {
        return Título;
    }

    public String getInicio() {
        return Inicio;
    }

    public String getFin() {
        return Fin;
    }
}
