package com.mia;

/**
 * 6.8.1
 */
public class ProcessArray {
    public void process(int[] target, Command cmd) {
        for (int t : target) {
            cmd.process(t);
        }
    }
}
