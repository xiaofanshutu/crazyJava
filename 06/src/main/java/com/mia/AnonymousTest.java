package com.mia;


interface Product {
    double getPrice();
    String getName();
}

public class AnonymousTest {
    public static void main(String[] args) {
        AnonymousTest anonymousTest = new AnonymousTest();
        anonymousTest.test(new Product() {
            public double getPrice() {
                return 99.9;
            }

            public String getName() {
                return "笔记本电脑";
            }
        });
    }

    public void test(Product p) {
        System.out.println("产品名称: " + p.getName());
        System.out.println("产品价格: " + p.getPrice());
    }
}
