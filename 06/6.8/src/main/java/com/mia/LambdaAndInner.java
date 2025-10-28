package com.mia;

import java.sql.SQLOutput;

@FunctionalInterface
interface Displayable {
    void display();

    default int add(int a, int b) {
        return a + b;
    }
}


public class LambdaAndInner {
    private int age = 12;
    private static String name = "Mia";

    public void test() {
        String book = "疯狂Java讲义";
        Displayable d = () -> {
            System.out.println("age = " + age);
            System.out.println("name = " + name);
            System.out.println("book = " + book);
        };
        d.display();
        System.out.println(d.add(3, 5));
    }

    public static void main(String[] args) {
        LambdaAndInner lamdbaAndInner = new LambdaAndInner();
        lamdbaAndInner.test();
    }
}
