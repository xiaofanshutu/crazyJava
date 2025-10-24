package com.mia;

/**
 * 6.8.1 使用Lambda表达式实现函数式接口
 */
public class CommandTest2 {
    public static void main(String[] args) {
        ProcessArray processArray = new ProcessArray();
        int[] target = {3, -4, 6, 4};
        processArray.process(target, (int element) -> {
            System.out.println("Processing element: " + element);
        });
    }
}
