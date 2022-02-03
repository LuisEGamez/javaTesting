package org.itacademy.javatesting.junit;

import org.junit.BeforeClass;
import org.junit.Test;

public class CochesTest {

    static Coches coches;

    @BeforeClass
    public static void beforeClass(){
        coches = new Coches();
        System.out.println("Instanciamos solo una vez el objeto meses");
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testElegirColor() {
        coches.mostrarColores();
    }
}