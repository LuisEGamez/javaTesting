package org.itacademy.javatesting.junit;

import java.util.ArrayList;
import java.util.List;

public class Meses {

    private List<String> meses;

    public Meses() {
        meses = new ArrayList<>();
        meses.add("Enero");
        meses.add("Febrero");
        meses.add("Marzo");
        meses.add("Abril");
        meses.add("Mayo");
        meses.add("Junio");
        meses.add("Julio");
        meses.add("Agosto");
        meses.add("Septiembre");
        meses.add("Octubre");
        meses.add("Noviembre");
        meses.add("Diciembre");
    }

    public List<String> getMeses() {
        return meses;
    }
}
