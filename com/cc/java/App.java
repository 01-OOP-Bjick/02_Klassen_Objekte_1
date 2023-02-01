package com.cc.java;

public class App {
    
    public static void main(String[] args) {
        
    // Instanziierung class --> objekt
    // cat --> Referenzvariable
    // Cat --> Reverenztyp
        Cat cat = new Cat("Grizabella", "white", 29);

        output(cat.getName());
        output(cat.getFurColor());
        output(String.valueOf(cat.getAge()));    // Typkonvertierung

        cat.setFurColor("gray");
        output(cat.getFurColor());

        output("----------------------------------------");

        Cat cat2 = new Cat("Alonzo", "gray", 35);

        output(cat2.getName());
        output(cat2.getFurColor());
        output(String.valueOf(cat2.getAge()));    // Typkonvertierung
    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }
}