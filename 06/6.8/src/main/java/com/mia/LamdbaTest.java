package com.mia;

@FunctionalInterface
interface FKTest {
    void test();
}

public class LamdbaTest {
    public static void main(String[] args) {
        Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        };
        r.run();

        // Target type of a lambda conversion must be an interface
//        Object obj = () -> {
//            for (int i = 0; i < 10; i++) {
//                System.out.println(i);
//            }
//        };
        r.run();
    }
}
