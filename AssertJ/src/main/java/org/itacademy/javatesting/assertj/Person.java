package org.itacademy.javatesting.assertj;

public class Person {

    private String name, lastname;
    private int age;
    private String[] friends;

    public Person(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        friends = new String[]{"Pedro", "Maria"};
    }

    public void showFriends() throws ArrayIndexOutOfBoundsException{
        for (int i = 0; i<= friends.length; i++) {
            System.out.println(friends[i]);
        }
    }
}
