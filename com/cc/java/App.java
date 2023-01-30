package com.cc.java;

public class App {
    
    public static void main(String[] args) {
        
        Cat cat = new Cat();    // Instanziierung class --> objekt
        System.out.println(cat);
        cat.tellYourAddress();
        
        System.out.println("---------------------");

        Cat cat2 = new Cat();
        System.out.println(cat2);
        cat2.tellYourAddress();
    }

  



}