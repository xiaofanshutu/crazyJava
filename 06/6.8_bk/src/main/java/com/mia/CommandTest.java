package com.mia;

public class CommandTest {
    public static void main(String[] args) {
        ProcessArray processArray = new ProcessArray();
        int[] target = {3, -4, 6, 4};
        processArray.process(target, new Command() {

            @Override
            public void process(int element) {
                System.out.println("数组元素的平方是: " + element * element);
            }
        });
    }
}
