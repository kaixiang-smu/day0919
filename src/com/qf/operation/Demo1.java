package com.qf.operation;

// 赋值运算符
public class Demo1 {
    public static void main(String[] args) {
        int a = 1;
        a += 2;
        System.out.println(a);
        double d = 3.0;
        d += 2;
        System.out.println(d);

        int i = 1;
//        i += 1;
        i = i + 1;
        System.out.println(i);

        short s = 1;
//        s += 1;       // += 可以默认进行类型转换
        s = (short) (s + 1);
        System.out.println(s);
    }
}
