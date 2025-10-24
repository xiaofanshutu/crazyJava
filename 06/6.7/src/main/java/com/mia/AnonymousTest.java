package com.mia;

/**
 * 6.7.5 匿名内部类实现接口
 */
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

//        anonymousTest.test(new AnonymousProduct());
    }

    // 接收一个Product接口类型的参数
    // 需要用对象调用该方法
    public void test(Product p) {
        System.out.println("产品名称: " + p.getName());
        System.out.println("产品价格: " + p.getPrice());
    }
}

class AnonymousProduct implements Product {
    @Override
    public double getPrice() {
        return 99.9;
    }

    @Override
    public String getName() {
        return "笔记本电脑";
    }
}
