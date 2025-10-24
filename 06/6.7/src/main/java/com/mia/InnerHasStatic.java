package com.mia;

/**
 * 6.7.1
 * 演示非静态内部类中定义静态成员
 * <p>
 * 在Java 16之前，
 * 非静态内部类中不能定义静态成员（静态变量、静态方法、静态代码块）
 * 因为非静态内部类的实例是依赖于外部类的实例的，而静态成员是属于类本身的，与实例无关
 * <p>
 * 在Java 16以后的版本，
 * 允许在非静态内部类中定义静态成员
 */
public class InnerHasStatic {
    private class Inner {
        // 从Java16开始，非静态内部类中允许定义静态成员（静态代码块，静态常量，静态方法）
        static {
            System.out.println("静态代码块被执行");
        }

        private static int inProp = 5;

        private static void test() {
            System.out.println("静态方法被调用");
        }
    }

    public static void main(String[] args) {
        System.out.println("访问非静态内部类的静态变量：" + Inner.inProp);
        Inner.test();
    }
}
