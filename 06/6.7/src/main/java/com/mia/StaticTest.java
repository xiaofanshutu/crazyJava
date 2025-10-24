package com.mia;

/**
 * 6.7.1
 * 演示静态成员不能直接访问非静态成员
 */
public class StaticTest {
    private class In {
    }

    public static void main(String[] args) {
        // 编译错误
        // 静态成员（main方法）不能直接访问非静态成员（In类）
        // new In();// 'com. mia. StaticTest. this' cannot be referenced from a static context
    }
}
