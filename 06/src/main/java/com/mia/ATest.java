package com.mia;

interface A {
    void test();
}


public class ATest {
    public static void main(String[] args) {
        int age = 8;
        var a = new A() {
            public void test() {
                System.out.println("匿名内部类实现接口A的test方法，age=" + age);
            }
        };
        a.test();
    }
}
