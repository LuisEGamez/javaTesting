package org.itacademy.javatesting.junit;

import java.util.ArrayList;
import java.util.List;

public class CalculoDni {

    private int numeroDni;
    private char letra;

    public CalculoDni(int numeroDni) {
        this.numeroDni = numeroDni;
        letra = calculoLetra(numeroDni);
    }

    public int getNumeroDni() {
        return numeroDni;
    }

    public char getLetra() {
        return letra;
    }

    public List<Character> characterArrayList(){
        List<Character> letras = new ArrayList<>();
        letras.add('T'); letras.add('R'); letras.add('W'); letras.add('A'); letras.add('G');
        letras.add('M'); letras.add('Y'); letras.add('F'); letras.add('P'); letras.add('D');
        letras.add('X'); letras.add('B'); letras.add('N'); letras.add('J'); letras.add('Z');
        letras.add('S'); letras.add('Q'); letras.add('V'); letras.add('H'); letras.add('L');
        letras.add('C'); letras.add('K'); letras.add('E');
        return letras;
    }

    public char calculoLetra(int numeroDni){
        List<Character> letras = characterArrayList();
        return letra = letras.get(numeroDni%23);
    }
}


