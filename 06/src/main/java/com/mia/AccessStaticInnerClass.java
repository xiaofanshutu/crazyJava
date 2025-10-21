package com.mia;

public class AccessStaticInnerClass {
    static class StaticInnerClass {
        private static int prop1 = 9;
        private int prop2 = 5;
    }

    public void accessInnerProp() {
        // 下面代码出现错误，访问格式不对
        // System.out.println(prop1);

        // 外部类可以直接访问静态内部类的静态变量：静态内部类类名.静态变量名
        System.out.println("静态内部类的静态成员prop1: " + StaticInnerClass.prop1);

        // 外部类访问静态内部类的实例变量，需要先创建静态内部类的实例，然后通过该实例访问
        StaticInnerClass staticInnerClass = new StaticInnerClass();
        System.out.println("静态内部类的实例成员prop2: " + staticInnerClass.prop2);
    }

    public static void main(String[] args) {
        AccessStaticInnerClass accessStaticInnerClass = new AccessStaticInnerClass();
        accessStaticInnerClass.accessInnerProp();
    }
}
