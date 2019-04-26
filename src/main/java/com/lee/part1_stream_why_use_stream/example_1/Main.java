package com.lee.part1_stream_why_use_stream.example_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created with : IntelliJ IDEA
 * User : KingIsHappy
 * Date : 2019/4/19
 * Time : 0:20
 * Description :
 */
public class Main {


    public static void main(String[] args) {
        List<Apple> appleList = Arrays.asList(
                new Apple("red", 1.0D, 3.0D),
                new Apple("red", 2.0D, 4.45D),
                new Apple("green", 2.0D, 3.45D),
                new Apple("yellow", 3.0D, 1.25D),
                new Apple("pink", 2.5D, 5.65D),
                new Apple("green", 4.5D, 4.98D),
                new Apple("red", 6.34D, 9.98D),
                new Apple("yellow", 1.98D, 0.98D)
        );

    }

    /**
     * 需求1：挑出其中绿色的苹果
     *
     * @param appleList
     */
    private static List<Apple> filterApples(List<Apple> appleList) {
        List<Apple> greenApples = new ArrayList<>();
        for (Apple a : appleList) {
            if ("green".equals(a.getColor())) {
                greenApples.add(a);
            }
        }
        return greenApples;
    }

    /**
     * 需求2：挑出红色的苹果
     */
    private static List<Apple> filterApplesByColor(List<Apple> appleList, String color) {
        List<Apple> pickedApples = new ArrayList<>();
        for (Apple a : appleList) {
            if (color.equals(a.getColor())) {
                pickedApples.add(a);
            }
        }
        return pickedApples;
    }

    /**
     * 需求3:挑出质量大于3.0的苹果
     */
    private static List<Apple> filterApplesByWeight(List<Apple> appleList, Double minWeight) {
        List<Apple> pickedApples = new ArrayList<>();
        for (Apple a : appleList) {
            if (a.getWeight() > minWeight) {
                pickedApples.add(a);
            }
        }

        return pickedApples;
    }

    private static List<Apple> filterApplesWithFilterFuntion(List<Apple> appleList, AppleFilter filter) {
        List<Apple> pickedApple = new ArrayList<>();
        for (Apple a : appleList) {
            if (filter.filter(a)) {
                pickedApple.add(a);
            }
        }

        return pickedApple;
    }


    /**
     * Java 8 中的处理方式
     *
     * @param appleList
     */
    private static void pickApples(List<Apple> appleList) {
        // 需求1：
        List<Apple> greenApples = appleList.stream().filter(a -> "green".equals(a.getColor())).collect(Collectors.toList());
        System.out.println(greenApples);

        // 需求2：
        List<Apple> redAples = appleList.stream().filter(a -> "red".equals(a.getColor())).collect(Collectors.toList());
        System.out.println(redAples);

        // 需求3：
        List<Apple> min3Apples = appleList.stream().filter(a -> 3.0D > a.getWeight()).collect(Collectors.toList());
        System.out.println(min3Apples);

        // 复杂需求：客户要红苹果，质量介于2.0到4.0之间（个头中等），价格低于3.0的?
        List<Apple> complexApples = appleList.stream().filter(a -> ("red".equals(a.getColor()) && a.getWeight() > 2.0D && a.getWeight() < 4.0D && a.getPrice() < 3.0D)).collect(Collectors.toList());
        System.out.println(complexApples);
    }


}
