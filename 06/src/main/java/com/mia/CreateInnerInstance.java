package com.mia;

public class CreateInnerInstance {
    public static void main(String[] args) {
        Out out = new Out();
        Out.In in = out.new In("Hello, Inner Class!");
    }
}

class Out{
    class In{
        public In(String msg){
            System.out.println("内部类构造器收到消息: " + msg);
        }
    }
}
