package com.qf.print;

/**
 * 这个类用来演示输出语句
 */
public class Demo1 {
    public static void main(String[] args) {
        // 输出语句
        /**
         * print() 输出完不换行
         * println() 输出完换行
         * ln 是单词line行的意思
         */
        System.out.println("你好");
        System.out.println("啊");
//        System.out.print("你好");
//        System.out.print("啊");
        System.out.println("----------华丽的分割线----------");
        System.out.println("  《咏鹅》");
        System.out.println("      骆宾王");
        System.out.println("   鹅鹅鹅，");
        System.out.println("   曲项向天歌");
        System.out.println("   白毛浮绿水");
        System.out.println("   红掌拨清波");

        System.out.println("----------华丽的分割线----------");
        /**
         * java中有特殊的转义字符
         * 转义字符：有特殊的功能，不再是字符
         * 例如：\r\n功能是换行
         * \r：回车
         * \n：换行
         * Java中\r\n可以连用，即回车加换行
         */
        System.out.println("你好啊！\r\nJava");

        System.out.print("鹅鹅鹅，\r\n曲项向天歌");
        System.out.print("\n");
        System.out.print("鹅鹅鹅，\n曲项向天歌");
    }
}
