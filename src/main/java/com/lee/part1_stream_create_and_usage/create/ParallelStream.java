package com.lee.part1_stream_create_and_usage.create;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/** .stream()创建的是单线程处理的顺序流，而parallel创建的则是多线程的
 * @author lee
 * @date 2020/3/12 23:10
 */
public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            nums.add((int) (Math.random() * 10000));
        }

        long start = System.currentTimeMillis();
        nums.parallelStream().sorted(Comparator.comparing((Function<Integer, Integer>) integer -> null));
        System.out.println("耗时: " + (System.currentTimeMillis() - start));
//        Stream<Integer> stringStream = nums.parallelStream();
    }

}
