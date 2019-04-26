package com.lee.part1_stream_why_use_stream.example_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author WangLe
 * @date 2019/4/22 10:06
 * @description 需求:过滤出菜单中卡路里小于300的食物,并按照卡路里排序,最后列出菜单列表
 */
public class Main {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("西红柿炒鸡蛋", 350),
                new Dish("凉拌黄瓜", 180),
                new Dish("酸辣土豆片", 350),
                new Dish("红烧排骨", 600),
                new Dish("清炒时蔬", 100),
                new Dish("白开水", 0),
                new Dish("白开水", 0),
                new Dish("可乐", 300)
        );

        List<String> menuNameList1 = filter1(menu);
        System.out.printf("使用java 7来实现需求,获取的菜单列表如下:\n %s \n", menuNameList1.toString());

        List<String> menuNameList2 = filter2(menu);
        System.out.printf("使用java 8来实现需求,获取的菜单列表如下:\n %s \n", menuNameList2.toString());


    }

    /**
     * 使用Java 7来实现需求
     */
    private static List<String> filter1(List<Dish> dishList) {
        // 提取出卡路里小于300的食物
        List<Dish> lowCaloriesDishList = new ArrayList<>();
        for (Dish d : dishList) {
            if (d.getCalories() < 300) {
                lowCaloriesDishList.add(d);
            }
        }

        // 按照卡路里排序
        lowCaloriesDishList.sort(new Comparator<Dish>() {
            @Override
            public int compare(Dish o1, Dish o2) {
                return o1.getCalories() - o2.getCalories();
            }
        });

        //取出名称 name
        List<String> lowCaloriesDishName = new ArrayList<>();
        for (Dish d : lowCaloriesDishList) {
            lowCaloriesDishName.add(d.getName());
        }

        return lowCaloriesDishName;
    }

    /**
     * 使用Java 8来实现需求
     *
     * @param dishList
     * @return
     */
    private static List<String> filter2(List<Dish> dishList) {
        return dishList.stream()
                .filter(dish -> dish.getCalories() < 300) // 筛选出卡路里值小于300的
                .sorted(Comparator.comparing(Dish::getCalories)) // 根据卡路里来排序
                .map(Dish::getName) // 取出name
                .collect(Collectors.toList()); // 转化成List
    }
}
