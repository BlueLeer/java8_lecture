package com.lee.part0_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created with : IntelliJ IDEA
 * User : KingIsHappy
 * Date : 2019/4/19
 * Description :
 */
public class FunctionInterfaceUsage {
    public static void main(String[] args) {
        //**********************************************************
        Student student = new Student("王五", 140D);
        // 判断该学生的体重是否超过了100
        Predicate<Student> predicate = s -> s.getWeight() > 100D;
        if (predicate.test(student)) {
            System.out.println("该学生的体重超过100啦~~~");
        }
        //**********************************************************
        Apple apple = new Apple("red", 250D, 3.5D);
        Consumer<Apple> consumer = a -> {
            System.out.println("先削皮...");
            System.out.println("切片...");
            System.out.println("牙签串起来...");
            System.out.println("吃...");
        };

        consumer.accept(apple);
        //**********************************************************
        // 给定一些苹果,如果苹果是绿色的,就把价格打8折
        Predicate<Apple> predicateColor = a -> "green".equals(a.getColor());
        Consumer<Apple> consumerApple = a -> a.setPrice(a.getPrice() * 0.8);

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
        List<Apple> collect = appleList.stream().filter(predicateColor).collect(Collectors.toList());
        System.out.println(collect);

//        filterApples(appleList, predicateColor, consumerApple);
//        System.out.println(appleList);


    }

    /**
     * 对苹果进行过滤
     *
     * @param appleList
     * @param predicate
     * @param consumer
     */
    private static void filterApples(List<Apple> appleList, Predicate<Apple> predicate, Consumer<Apple> consumer) {
        for (Apple a : appleList) {
            if (predicate.test(a)) {
                consumer.accept(a);
            }
        }
    }
}
