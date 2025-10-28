package com.mia;

public class ProcessArray {
    public void process(int[] target, Command cmd) {
        for (int i : target) {
            cmd.process(i);
        }
    }
}
