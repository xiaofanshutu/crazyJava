package com.mia;

interface Eatable {
    void taste();
}

interface Flyable {
    void fly(String weather);
}

interface Addable {
    int add(int a, int b);
}

public class LambdaQs {
    public void eat(Eatable e) {
        e.taste();
    }

    public void drive(Flyable f) {

    }

    public void test(Addable a) {
        a.add(1, 2);
    }

    public static void main(String[] args) {
        LambdaQs lq = new LambdaQs();
        lq.eat(() -> System.out.println("这东西真好吃！"));

        lq.drive(weather -> {
            System.out.println("今天天气是：" + weather + "，我在天空自由飞翔！");
        });


ls.fly(new )
    /*
    // 使用 Lambda 表达式计算两个数的和
    MathOperation addition = (a, b) -> a + b;

    // 调用 Lambda 表达式
    int result = addition.operation(5, 3);
    System.out.println("5 + 3 = " + result);
     */

    }
}
