package com.lee.part1_stream_create_and_usage.usage;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author WangLe
 * @date 2019/2/21 16:45
 * @description
 */
public class MapAndReduceInStream {
    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Stream<Integer> stream = Arrays.stream(nums);

        List<String> strings = stream.map(i -> "Hello->" + i).collect(Collectors.toList());
//        System.out.println(strings);

        // flatMap方法的使用
        Stream<String> stringStream = Arrays.stream(new String[]{"Hello", "World"});
        Stream<String[]> stream1 = stringStream.map(s -> s.split(""));
        Stream<String> stringStream1 = stream1.flatMap(strings1 -> Arrays.stream(strings1).distinct());
        stringStream1.forEach(System.out::println);

        System.out.println("====================");
        // 求和的方法
        Integer reduce = Arrays.stream(nums).reduce(0, (a, b) -> a + b);
        System.out.println(reduce);

    }
}
