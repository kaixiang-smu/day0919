package com.qf.operation;

public class Demo3 {
    public static void main(String[] args) {
        /**
         * 如何写题？
         * 千万不要等全部想通再下手，刚开始写就是模仿
         * 应该是能写多少写多少
         * 题目：使用【运算符】进行编程
         * 定义变量double salary，给其赋值后
         * 1、计算输出实领工资
         * 其中物价津贴为基本工资的4%
         *    房租津贴为基本工资的2.5%
         *    社保为基本工资的1.25%
         *    话费补贴为100
         * 2、输出一张完整的工资条
         */
        double salary = 10000;
//        double real_salary = salary*(1+4%+2.5%-1.25%)+100;
       double real_salary = salary+salary*0.04+salary*0.025-salary*0.0125+100;
        System.out.println("实领工资为"+real_salary+"￥");
    }
}
