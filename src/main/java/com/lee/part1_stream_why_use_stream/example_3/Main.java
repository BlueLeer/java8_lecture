package com.lee.part1_stream_why_use_stream.example_3;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author WangLe
 * @date 2019/4/22 10:06
 * @description 需求:过滤出菜单中卡路里小于300的食物,并按照卡路里排序,最后列出菜单列表,菜单数量很多
 */
public class Main {
    public static void main(String[] args) {
        List<Dish> menu = new ArrayList<>();

        IntStream.rangeClosed(0, 100000).mapToObj(i -> new Dish("菜单名称" + i, (int) (Math.random() * 100))).forEach(dish -> menu.add(dish));

        long startTime = System.currentTimeMillis();
        List<String> menuNameList1 = filter1(menu);
        System.out.printf("使用串行处理来实现需求,获取的菜单列表如下:\n 耗时:%s \n", System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();
        List<String> menuNameList2 = filter2(menu);
        System.out.printf("使用并行处理来实现需求,获取的菜单列表如下:\n 耗时:%s \n", System.currentTimeMillis() - startTime);


    }

    /**
     * 使用Java 8来实现需求
     */
    private static List<String> filter1(List<Dish> dishList) {
        return dishList.stream()
                .filter(dish -> dish.getCalories() < 300) // 筛选出卡路里值小于300的
                .sorted(Comparator.comparing(Dish::getCalories)) // 根据卡路里来排序
                .map(Dish::getName) // 取出name
                .collect(Collectors.toList()); // 转化成List
    }

    /**
     * 使用Java 8来实现需求,利用多核架构来实现并行处理
     *
     * @param dishList
     * @return
     */
    private static List<String> filter2(List<Dish> dishList) {
        return dishList.parallelStream()
                .filter(dish -> dish.getCalories() < 300) // 筛选出卡路里值小于300的
                .sorted(Comparator.comparing(Dish::getCalories)) // 根据卡路里来排序
                .map(Dish::getName) // 取出name
                .collect(Collectors.toList()); // 转化成List
    }
}
