package com.qf.datatype;
// 基本数据类型之浮点型
public class Demo2 {
    public static void main(String[] args) {
        /**
         * float 浮点数，小数类型，单精度 32位
         * 程序中出现的小数，认为都是double类型
         * float类型的数据，需要在末尾加F/f以示区分
         */
        float f = 1.1F;
        float f2 = 1.1234567890123456F;
        System.out.println(f2);
        /**
         * double 浮点数，小数类型，双精度 64位
         * double类型的数据，可以在末尾加D/d，也可以不加
         */
        double d = 1.1D;
        double d2 = 1.1234567890123456D;
        System.out.println(d2);
        // 工作中只会用到double
    }
}
