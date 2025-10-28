package com.mia;

public class Lambdas {
    void printThing(Printable printable) {
        printable.print();
    }

    public static void main(String[] args) {
        Lambdas lambdas = new Lambdas();
        lambdas.printThing(() -> System.out.println("Hello, Lambda!"));
    }
}
