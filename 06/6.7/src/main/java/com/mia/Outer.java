package com.mia;

/**
 * 6.7.1
 * 演示非静态内部类访问外部类的实例变量，以及外部类访问非静态内部类的实例变量
 *
 * 非静态内部类可以直接访问外部类的private实例变量
 * 外部类不能直接访问非静态内部类的实例变量，需要先创建内部类的实例，然后通过该实例访问内部类的实例变量
 *
 */
public class Outer {
    private int outProp;

    class Inner {
        private int intProp = 5;

        public void accessOuterProp() {
            // 非静态内部类可以直接访问外部类的private实例变量
            System.out.println("外部类的outProp值为：" + outProp);
        }
    }

    public void accessInnerProp() {
        // 外部类不能直接访问非静态内部类的实例变量
        // 下面这段代码会出现编译错误
        //  System.out.println("内部类的inProp值为：" + inProp);

        // 需要先创建内部类的实例，然后通过该实例访问内部类的实例变量
        System.out.println("内部类的inProp值为：" + new Inner().intProp);

        System.out.println("访问外部类的实例变量：");
        new Inner().accessOuterProp();
    }

    public static void main(String[] args) {
        // 下面这行代码，只创建了外部类对象，未创建内部类对象
        Outer outer = new Outer();
        outer.accessInnerProp();
    }
}
