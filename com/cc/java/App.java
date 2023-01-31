package com.cc.java;

public class App {
    
    public static void main(String[] args) {
        
    // Instanziierung class --> objekt
    // cat --> Referenzvariable
    // Cat --> Reverenztyp
        Cat cat = new Cat();

        cat.name = "Grizabella";
        cat.furColor = "white";
        cat.age = 29;

        output(cat.name);
        output(cat.furColor);
        output(String.valueOf(cat.age));    // Typkonvertierung


        output("Blick von aussen: " + cat);
        output(cat.tellYourAddress());

        output("----------------------------------------");

        Cat cat2 = new Cat();

        cat2.name = "Alonzo";
        cat2.furColor = "gray";
        cat2.age = 35;

        output(cat2.name);
        output(cat2.furColor);
        output(String.valueOf(cat2.age));    // Typkonvertierung


        output("Blick von aussen: " + cat2);
        output(cat2.tellYourAddress()); 
    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }
  



}