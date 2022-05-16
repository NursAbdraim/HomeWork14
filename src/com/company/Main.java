package com.company;

public class Main {

    public static void main(String[] args) {
    Programmer programmer = new Programmer("Nursultan", "Coding", "Peaksoft");
        System.out.println(programmer.toString());
        programmer.coding();
        programmer.learn();
        programmer.walk();
        programmer.eat();

	Dancer dancer = new Dancer("Atai", "Dancing", "Tumar");
        System.out.println(dancer.toString());
        dancer.dancing();
        dancer.learn();
        dancer.walk();
        dancer.eat();

    Singer singer = new Singer("Nick Carter", "Singing", "Backstreet Boys");
        System.out.println(singer.toString());
        singer.singing();
        singer.playGuitar();
        singer.learn();
        singer.walk();
        singer.eat();




    }


}
