package org.itacademy.javatesting.assertj;
import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

import java.util.*;

public class MainClassTest {
    // Ejercicio 1 =========================
    @Test
    public void testNumbersEquals() {

        Integer num1 = 5;
        Integer num2 = 5;
        assertThat(num1).isEqualTo(num2);
    }

    @Test
    public void testNumbersNotEquals() {
        Integer num1 = 5;
        Integer num2 = 4;
        assertThat(num1).isNotEqualTo(num2);
    }
    
    // Ejercicio 2 =========================
    
    @Test
    public void testObjectsReferenceEquals() {
        Person person1= new Person("Juan", "Rodriguez",45);
        Person person2 = person1;
        assertThat(person1).isEqualTo(person2);
    }

    @Test
    public void testObjectsReferenceNotEquals() {
        Person person1= new Person("Juan", "Rodriguez",45);
        Person person2 = new Person("Luis","Garcia", 88);
        assertThat(person1).isNotEqualTo(person2);
    }
    
    // Ejercicio 3 =========================

    @Test
    public void testArraysEquals() {
        int[] ar1 = {1, 5, 8};
        int[] ar2 = {1, 5, 8};
        assertThat(ar1).containsExactly(ar2);
    }

    // Ejercicio 4 =========================

    @Test
    public void testCheckOrderInsertion() {
        Person person1 = new  Person("Juan", "Rodriguez",45);
        Person person2 = new Person("Luis", "Gomez",48);
        Person person3 = new Person("Ana", "Matos",32);

        List<Person> list = new ArrayList<>();

        list.add(person1);
        list.add(person2);
        list.add(person3);


        assertThat(list).containsSequence(person1, person2, person3);// Misma secuencia
        assertThat(list).contains(person3, person1, person2); // En cualquier orden

        // Para poder probar este assert es necesario comentar los dos assert anteriores y no añadir a person3.

        //assertThat(list).containsOnlyOnce(person1).doesNotContain(person3);// Solo contiene uno y no contiene.
    }

    // Ejercicio 5 =========================

    @Test
    public void testKeyMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Lobo");
        map.put(2, "Perro");
        map.put(3, "Gato");

        assertThat(map).containsKey(2);
    }

    // Ejercicio 6 =========================

    @Test()
    public void testShowFriends() {
        assertThatThrownBy(() ->{
                Person person = new  Person("Juan", "Rodriguez",45);
                person.showFriends();})
                .isInstanceOf(ArrayIndexOutOfBoundsException.class);


    }

    // Ejercicio 7 =========================


    @Test
    public void testEmptyObject() {
        Optional<Object> op = Optional.empty();
        assertThat(op).isEmpty();
    }
}
