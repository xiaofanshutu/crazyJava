package com.mia;

/**
 * 6.7.5
 * 演示匿名内部类
 */

// 抽象类Device，有两个构造器，一个有参构造器，一个无参构造器
abstract class Device {
    private String name;

    public abstract double getPrice();

    public Device() {
    }

    public Device(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class AnonymousInner {
    // 接收一个Device类型的参数
    public void test(Device d) {
        System.out.println("设备名称: " + d.getName());
        System.out.println("设备价格: " + d.getPrice());
    }

    public static void main(String[] args) {
        AnonymousInner anonymousInner = new AnonymousInner();

        // 调用有参构造器创建匿名内部类（Device）对象
        anonymousInner.test(new Device("iPhone17") {
            @Override
            public double getPrice() {
                return 5499;
            }
        });

        // 调用无参构造器创建匿名内部类（Device）对象
        Device d = new Device() {
            {
                System.out.println("匿名内部类的代码块");
            }

            @Override
            public double getPrice() {
                return 210;
            }

            public String getName() {
                return "小米手环8";
            }
        };
        anonymousInner.test(d);
    }
}
