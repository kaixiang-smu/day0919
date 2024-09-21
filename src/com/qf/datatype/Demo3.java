package com.qf.datatype;
// 基本数据类型之字符型
public class Demo3 {
    public static void main(String[] args) {
        /**
         * 字符（character）
         * 1、赋值时需要使用单引号！！！
         * 2、单引号内有且只有一个字符，多个字符用String，双引号
         * 3、特别的，char也可以被数字赋值，从0-65535
         * 前128个数是ASCII码
         */
        char c1 = ' ';
        char c2 = 'a';
        char c3 = '中';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        char c4 = 65;
        System.out.println(c4);
        char c5 = 97;
        System.out.println(c5);
    }
}
