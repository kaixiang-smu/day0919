package com.qf.datatype;
//演示各种基本数据类型
public class Demo1 {
    public static void main(String[] args) {
        /**
         * byte 字节
         * 1byte=8bit（位） 共能表示256个数
         * -128 ~ 127（-2^7 ~ 2^7-1）
         *
         */
        byte by = -128;
        /**
         * short 短整型
         * 1short=2byte=16bit
         * -32768 ~ 32767
         * -2^15 ~ 2^15-1
         */
        short sh = -32768;
        /**
         * int 整型（integer）
         * 1int=2short=4byte=32bit
         * -2147483648 ~ 2147483647
         * -2^31 ~ 2^31-1
         * int是最常见的整形数据，只要没有特殊说明
         * 整型都用int，比如 int age
         */
//        System.out.println(Integer.MAX_VALUE);
        int i = 2147483647;
        /**
         * long 长整型
         * 1long=2int=4short=8byte=64bit
         * -9223372036854775808 ~ 9223372036854775807
         * -2^63 ~ 2^63-1
         * long型需要使用L在末尾区分
         */
//        System.out.println(Long.MAX_VALUE);
        long l = 32147483647L;
        // 整型有4个，但是工作中大部分场景都是使用int类型
    }
}
