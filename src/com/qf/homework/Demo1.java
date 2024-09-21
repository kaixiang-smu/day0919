package com.qf.homework;

public class Demo1 {
    public static void main(String[] args) {
        /**
         * 用合适的变量名，以及数据类型声明一下数据
         * 姓名，年龄，性别，身高，体重，余额，家庭住址
         * 并将结果输出
         */
        String name = "蛮族之王";
        int age = 35;
        char sex = '男';
        double height = 160.0;
        double weight = 80.0;
        double money = 450.0;
        String address = "弗雷尔卓德";
        System.out.println(name);
        System.out.println(age);
        System.out.println(sex);
        System.out.println(height);
        System.out.println(weight);
        System.out.println(money);
        System.out.println(address);
        System.out.println("------组词造句------");
        // 一个一个去拼太慢了
        System.out.println("我叫"+name+"，今年"+age+"岁，性别"+sex+"，身高"+height+"cm，体重"+weight+"kg。");
        // 口诀：先写完整的句子，选中替换的值，引号引号，加号加号，中间变量
        System.out.println("我叫"+name+"，今年"+age+"岁，性别"+sex+"，身高"+height+"厘米，体重"+weight+"公斤，我有"+money+"元，家住在"+address+"");

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        int a = 10;
        int b = 20;
        System.out.println("交换前，a="+a+"，b="+b+"");
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("交换后，a="+a+"，b="+b+"");
    }
}
