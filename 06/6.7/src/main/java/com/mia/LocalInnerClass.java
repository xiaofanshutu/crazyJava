package com.mia;

/**
 * 6.7.4
 * 局部内部类示例
 */
public class LocalInnerClass {
    public static void main(String[] args) {
        class InnerBase {
            int a;
        }

        class InnerSub extends InnerBase {
            int b;
        }

        InnerSub innerSub = new InnerSub();
        innerSub.a = 10;
        innerSub.b = 20;
        System.out.println("a=" + innerSub.a + ",b=" + innerSub.b);
    }
}
