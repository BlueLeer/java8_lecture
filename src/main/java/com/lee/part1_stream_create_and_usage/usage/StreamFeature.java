package com.lee.part1_stream_create_and_usage.usage;

import com.lee.part1_stream_create_and_usage.Dish;

import java.util.Arrays;
import java.util.List;

/**
 * @author lee
 * @date 2020/3/13 0:21
 */
public class StreamFeature {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("西红柿炒鸡蛋", 350),
                new Dish("凉拌黄瓜", 180),
                new Dish("酸辣土豆片", 350),
                new Dish("红烧排骨", 600),
                new Dish("清炒时蔬", 100),
                new Dish("白开水", 0),
                new Dish("可乐", 300)
        );

        // 四大特性:
        // 1.通过stream生成了返回了新的结果,不会改变原来的数据源
        // 2.惰性执行
        // 3.stream只能被用一次,就像集合的迭代器一样
        // 4.无存储
        // 会改变数据源
        menu.stream().forEach(c -> {
            c.setName("hahahhaha");
        });
        
        // 惰性执行
        menu.stream().filter(c -> c.getCalories() > 100);
        System.out.println(menu);
    }
}
