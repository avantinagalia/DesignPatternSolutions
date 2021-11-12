package com.patterns;

public class Main {

    public static void main(String[] args) {
        System.out.println("Observer Pattern: ");
        com.patterns.solution.observer.Demo.show();

        System.out.println("\nAdapter Pattern: ");
        com.patterns.solution.adapter.Demo.show();

        System.out.println("\nSingleton Pattern: ");
        com.patterns.solution.singleton.Demo.show();
        
        System.out.println("\nPrototype Pattern: ");
        com.patterns.solution.prototype.Demo.show();
    }
}
