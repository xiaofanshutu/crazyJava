package com.mia;

/**
 * 6.7.5
 * 在Java 8以前下面语句将提示错误：age必须使用final修饰
 * 从Java 8开始，匿名内部类、局部内部类允许访问非final的局部变量
 */
interface A {
    void test();
}

public class ATest {
    public static void main(String[] args) {
        int age = 8;
        // 下面代码将会导致1处的代码编译错误
//        age = 9;
        var a = new A() {
            public void test() {
                // 在Java 8以前下面语句将提示错误：age必须使用final修饰
                // 从Java 8开始，匿名内部类、局部内部类允许访问非final的局部变量
                System.out.println(age);// 1️⃣由于age局部变量被匿名内部类访问了，因此age相当于被final修饰了 Variable 'age' is accessed from within inner class, needs to be final or effectively final
            }
        };
        a.test();
    }
}

