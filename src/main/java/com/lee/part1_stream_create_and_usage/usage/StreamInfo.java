package com.lee.part1_stream_create_and_usage.usage;

import java.util.Arrays;
import java.util.List;

/**
 * @author WangLe
 * @date 2019/4/22 14:39
 * @description Stream简单的概念性原理性的示例
 */
public class StreamInfo {
    public static void main(String[] args) {
//        test1();
//        test2();
        test3();
    }

    private static void test1() {
        List<String> words = Arrays.asList("Hello", "Java", "8", "Python", "C++");
        // 没有终端操作,所以并不会打印出来
        words.stream().filter(w -> {
            System.out.println(w);
            return w.length() > 4;
        });

        // forEach 是一个终端操作,所以会打印出单词
        words.stream().filter(w -> w.length() > 3).forEach(System.out::println);
    }

    private static void test2() {
        List<String> words = Arrays.asList("Hello", "Java", "8", "Python", "C++");
        boolean b1 = words.stream().allMatch(w -> w.length() > 2);
        System.out.println(b1);

        words.stream().findFirst().ifPresent(System.out::println);
    }

    private static void test3() {
        List<String> words = Arrays.asList("Hello", "Java", "8", "Python", "C++");
        words.stream().findAny().ifPresent(System.out::println);

    }

    public <T extends Object> void get(T t) {
        System.out.println(t);
    }
}
