package com.mia;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 6.8.1
 * 演示使用匿名内部类实现接口
 */
public class CommandTest {
    public static void main(String[] args) {
        ProcessArray processArray = new ProcessArray();
        int[] target = {3, -4, 6, 4};
        processArray.process(target, new Command() {
            @Override
            public void process(int element) {
                System.out.println("Processing element: " + element);
            }
        });
    }
}
