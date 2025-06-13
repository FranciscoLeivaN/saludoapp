package com.equipo.saludo;

public class App 
{
    public static String saludar(String nombre) {
        return "¡Hola un gusto, " + nombre + "!";
    }

    public static void main(String[] args) {
        System.out.println(saludar("DevOps"));
    }
}
