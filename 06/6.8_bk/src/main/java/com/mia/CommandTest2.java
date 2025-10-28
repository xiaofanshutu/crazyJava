package com.mia;

public class CommandTest2 {
    public static void main(String[] args) {
        ProcessArray processArray = new ProcessArray();
        int[] target = {3, -4, 6, 4};
        processArray.process(target, element ->
                System.out.println("数组元素的平方是: " + element * element)
        );
    }
}
