package com.mia;

interface Eatable_bk {
    void taste();
}

interface Flyable_bk {
    void fly(String weather);
}

interface Addable_bk {
    int add(int a, int b);
}

public class LambdaQs_bk {
    public void eat(Eatable_bk e) {
        e.taste();
    }

    public void drive(Flyable_bk f) {
        f.fly("晴朗");
    }

    public void test(Addable_bk a) {
        a.add(1, 2);
    }

    public static void main(String[] args) {
        LambdaQs_bk lq = new LambdaQs_bk();
        lq.eat(() -> System.out.println("这东西真好吃！"));
        lq.eat(() -> System.out.println("这东西真好吃！"));

        lq.drive(weather -> {
            System.out.println("今天天气是：" + weather + "，我在天空自由飞翔！");
        });
        lq.drive(weather -> System.out.println("今天天气是：" + weather + "，我在天空自由飞翔！"));

        lq.test((a, b) -> {
            System.out.println("a + b = " + (a + b));
            return a + b;
        });

        lq.test((a, b) -> a + b);
    }
}
