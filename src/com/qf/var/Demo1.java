package com.qf.var;
//演示变量的定义
public class Demo1 {
    public static void main(String[] args) {
        /**
         * 1、变量的定义/声明
         * 数据类型 变量名；
         */
        int age;
        double money;
        byte img;
        /**
         * 2、变量赋值
         * 变量名 = 值；
         */
        age = 18;
        money = 19.2;
        img = 1;
        /**
         * 3、使用变量
         * 1）做运算
         * 2）当参数传给方法
         * 3）交给输出语句输出
         */
        System.out.println(age);
        System.out.println(money);
        System.out.println(img);
        // 总结：声明+赋值+使用
        // 以上代码可以简化
        int age2 = 19;
        System.out.println(age2);
    }
}
