package org.itacademy.javatesting.junit;

import org.junit.*;
import static org.junit.Assert.*;

public class MainClassTest {

    static Meses meses;

    @BeforeClass
    public static void beforeClass(){
        meses = new Meses();
        System.out.println("Instanciamos solo una vez el objeto meses");
    }

    @Test
    public void testIsEmpty() {
        boolean empty = meses.getMeses().isEmpty();
        assertFalse(empty);
        System.out.println("La lista no esta vacía");
    }

    @Test
    public void testSize() {
        int mesesSize = meses.getMeses().size();
        int expected = 12;
        assertEquals(expected, mesesSize);
        System.out.println("La lista contiene 12 elementos");
    }

    @Test
    public void testSinglePosition() {
        String mes = meses.getMeses().get(7);
        String expected = "Agosto";
        assertEquals(expected, mes);
        System.out.println("La posición 8 es Agosto");
    }
}
