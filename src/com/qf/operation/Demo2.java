package com.qf.operation;
// 演示算术运算
public class Demo2 {
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~~~~~~加法~~~~~~~~~~~~~~~");
        /**
         * + 加法
         * 1)数字相加，如果符号两边的数据类型不一致，
         * 运算结果会向大的一方转换
         * 2)字符串拼接
         */
          int a = 1;
          int b = 2;
          double d = 3.0;
          System.out.println(a + b);
          System.out.println(a + d);

          short s = 1;
          int i = 1;
          // short+int，结果是int
          int s2 = s + i;

          // 加法实现字符串拼接
        int a3 = 1;
        String s3 = "1";
        System.out.println(a3 + s3);
        System.out.println(1+1+"1"+1); // "21"+1
        System.out.println(1+1+"1"+1+1); // "211"+1
        // 总结：字符串前一个是拼接，字符串后全是拼接
        System.out.println("~~~~~~~~~~~~~~~~~减法~~~~~~~~~~~~~~~");
        /**
         * - 减法
         * 只能做数字相减
         */
        int a4 = 1;
        int a5 = 1;
        System.out.println(a4 - a5);
        double d5 = 1.0;
        System.out.println(a5 - d5);
        System.out.println("~~~~~~~~~~~~~~~~~乘法~~~~~~~~~~~~~~~");
        /**
         * * 乘法
         * 只能做数字相乘
         */
        System.out.println(2 * 3);
        System.out.println(2.0 * 3);
        System.out.println("~~~~~~~~~~~~~~~~~除法~~~~~~~~~~~~~~~");
        /**
         * / 除法
         * 1）做数字相除，
         *   如果整数相除，除不尽舍弃小数，直接取整
         *   如果想保留小数，就只能将其中一个数变为浮点型即可
         */
        System.out.println(10 / 2);
        System.out.println(10 / 3);
        System.out.println(10 / 4);
        System.out.println(10.0 / 4);
        System.out.println(10.0 / 3);
        System.out.println("~~~~~~~~~~~~~~~~~取余或取模~~~~~~~~~~~~~~~");
        /**
         *  % 取余或者取模
         *  除不尽的余数
         *  取余有个非常常见的场景：用来判断奇偶性
         */
        System.out.println(10 % 3);
        System.out.println(10 % 4);
        // 任何一个整数除以2的余数如果是0，该数是偶数
        System.out.println(10 % 2);
        System.out.println(9 % 2);
        System.out.println("~~~~~~~~~~~~~~~~~自增/自减~~~~~~~~~~~~~~~");
        /**
         * ++ 自增1
         * -- 自减1
         * 用法：
         * i++
         * ++i
         */
        int in = 1;
        in++;
        System.out.println(in);
        in--;
        System.out.println(in);
        int ix = 1;
        ++ix;
        System.out.println(ix);
        --ix;
        System.out.println(ix);

        int iy = 1;
//        int iz = iy++;  // ++在后，先用后增
        int iz = ++iy;    // ++在前，先增后用
        // 无论先+后+，本身一定会自增1
        System.out.println("iz="+iz);
        System.out.println("iy="+iy);

        int x = 4;
        int y = (x++)+(++x)+(x*10);
        System.out.println("x="+x);
        System.out.println("y="+y);
    }

}
