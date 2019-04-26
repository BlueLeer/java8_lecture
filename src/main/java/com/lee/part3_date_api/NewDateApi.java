package com.lee.part3_date_api;

import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author WangLe
 * @date 2019/4/26 15:15
 * @description
 */
public class NewDateApi {
    public static void main(String[] args) {
        test1();
        test2();
    }

    private static void test1() {
        LocalDate localDate = LocalDate.now();
        String format = localDate.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println(localDate);
        System.out.println(format);
    }

    private static void test2() {
        LocalDateTime localDateTime = LocalDateTime.now();
        String dateString = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(dateString);
    }
}
