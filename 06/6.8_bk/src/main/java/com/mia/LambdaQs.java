package com.mia;

/**
 * 演示lambda的几种简化写法
 */
interface Eatable{
    void taste();
}

interface Flyable{
    void fly(String weather);
}

interface Addable{
    int add(int a, int b);
}

public class LambdaQs {
    public void eat(Eatable e){
        e.taste();
    }

    public void drive(Flyable f){
        f.fly("晴朗");
    }

    public void test(Addable a){
        a.add(1,2);
    }

    public static void main(String[] args) {
        Flyable f = weather -> System.out.println("今天天气是："+weather+"，我在天空自由飞翔！");
        f.fly("多云");



        LambdaQs lambdaQs = new LambdaQs();
        lambdaQs.eat(()-> System.out.println("这东西真好吃！"));

        lambdaQs.drive(weather->{
            System.out.println("今天天气是："+weather+"，我在天空自由飞翔！");
        });

        lambdaQs.test((a,b)->{
            System.out.println("a + b = "+(a+b));
            return a + b;
        });
    }
}
