package com.cc.java;

public class App {
    
    public static void main(String[] args) {
        
    // Instanziierung class --> objekt
    // cat --> Referenzvariable
    // Cat --> Reverenztyp
        Cat cat = new Cat("Grizabella", "white", 29);

        output(cat.tellYourName());
        output(cat.tellYourFurColor());
        output(String.valueOf(cat.tellYourAge()));    // Typkonvertierung

        output("Blick von aussen: " + cat);
        output(cat.tellYourAddress());

        output("----------------------------------------");

        Cat cat2 = new Cat("Alonzo", "gray", 35);

        output(cat2.tellYourName());
        output(cat2.tellYourFurColor());
        output(String.valueOf(cat2.tellYourAge()));    // Typkonvertierung

        output("Blick von aussen: " + cat2);
        output(cat2.tellYourAddress()); 
    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }
  



}