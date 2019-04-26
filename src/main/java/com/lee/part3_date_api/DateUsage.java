package com.lee.part3_date_api;

import java.util.Date;

/**
 * @author WangLe
 * @date 2019/4/26 15:08
 * @description
 */
public class DateUsage {
    public static void main(String[] args) {
        test1();
        test2();
    }

    private static void test1() {
        // CST:China Strand Time
        Date date = new Date();
        System.out.println(date);
    }

    // 2014年3月18日
    private static void test2() {
        Date date = new Date(114, 2, 18);
        System.out.println(date);
    }
}
