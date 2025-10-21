package com.mia;

/**
 * 演示静态内部类访问外部类的静态变量
 *
 * 静态内部类不能直接访问外部类的非静态变量
 * 静态内部类可以直接访问外部类的静态变量
 */
public class StaticInnerClassTest {
    private int prop1 = 10;
    private static int prop2 = 20;

    // 静态内部类是独立的类，不依赖外部类实例；但如果内部类的方法是实例方法，调用它时仍需先创建该内部类的实例。
    static class StaticInnerClass {
        public void accessOuterProp() {
            System.out.println("访问外部类的静态变量prop2：" + prop2);

            // 编译错误，静态内部类不能直接访问外部类的非静态变量
//            System.out.println("访问外部类的非静态变量prop1：" + prop1);
        }
    }

    public static void main(String[] args) {
        // 因为静态内部类的方法不是静态方法，所以需要先创建静态内部类的实例，然后通过该实例调用方法
        StaticInnerClass staticInnerClass = new StaticInnerClass();
        staticInnerClass.accessOuterProp();
    }
}
