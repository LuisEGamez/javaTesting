package org.itacademy.javatesting.junit;

import java.util.ArrayList;

public class Coches {
    private String[] colorCoche;

    public Coches() {
        colorCoche = new String[]{"Rojo", "Blanco", "Negro"};

    }

    public void mostrarColores() throws ArrayIndexOutOfBoundsException  {

        for (int i = 0; i <= colorCoche.length; i++){
            System.out.println(colorCoche[i]);
        }
    }
}
