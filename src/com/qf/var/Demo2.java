package com.qf.var;
//变量定义的细节
public class Demo2 {
    public static void main(String[] args) {
        /**
         * 变量定义
         * 1.必须有数据类型
         * 2.使用前必须赋值
         * 3.名字首字母小写，如果多个单词，其他单词首字母大写
         * 4.不能使用特殊符号，但是可以使用下划线_（最好不要使用$）
         * 5.数字不能放在开头
         * 6.变量不能重复声明，即不能重复给变量设置数据类型
         *   换句话说，就是变量名不能重复[在同一个方法内变量不能重复]
         * 7.变量的值可以改变，即重新赋值
         */
        int age = 18;
        System.out.println(age);
        age = 19;
        System.out.println(age);
    }
}
