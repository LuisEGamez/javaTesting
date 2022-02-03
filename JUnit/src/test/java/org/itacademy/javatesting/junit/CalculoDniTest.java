package org.itacademy.javatesting.junit;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class CalculoDniTest {

    @Parameterized.Parameters
    public static Iterable<Object[]> getData(){
        List<Object[]> obj = new ArrayList<>();
        obj.add(new Object[]{75927915, 'Q'});
        obj.add(new Object[]{49211190, 'E'});
        obj.add(new Object[]{49393898, 'H'});
        obj.add(new Object[]{49592953, 'P'});
        obj.add(new Object[]{49680200, 'Q'});
        obj.add(new Object[]{50248079, 'W'});
        obj.add(new Object[]{50330485, 'E'});
        obj.add(new Object[]{50471166, 'N'});
        obj.add(new Object[]{50489678, 'D'});
        obj.add(new Object[]{50501313, 'Y'});
        return obj;
    }

    private Integer numeroDni;
    private Character letra;

    public CalculoDniTest(Integer numeroDni, Character letra) {
        this.numeroDni = numeroDni;
        this.letra = letra;
    }

    @Test
    public void name() {
        CalculoDni calculoDni = new CalculoDni(numeroDni);
        Character result = calculoDni.calculoLetra(numeroDni);
        assertEquals(letra, result);

    }
}