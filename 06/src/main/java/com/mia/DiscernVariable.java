package com.mia;

public class DiscernVariable {
    private String prop = "外部类的实例变量";

    private class InClass {
        private String prop = "内部类的实例变量";

        public void info() {
            var prop = "方法内的局部变量";
            // 访问同名变量时，遵循就近原则
            System.out.println("外部类的实例变量值:" + DiscernVariable.this.prop);// 使用 外部类名.this.变量名 访问外部类的实例变量
            System.out.println("内部类的实例变量值：" + this.prop);// 使用 this.变量名 访问内部类的实例变量
            System.out.println("方法内的局部变量值：" + prop);
        }
    }

    public void test() {
        var in = new InClass();
        in.info();
    }

    public static void main(String[] args) {
        new DiscernVariable().test();
    }
}
