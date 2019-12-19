package com.lee.part0_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Created with : IntelliJ IDEA
 * User : KingIsHappy
 * Date : 2019/4/19
 * Time : 3:23
 * Description :
 */
public class FunctionUsage {
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

        // 获取所有的颜色
        obtainNature(appleList, Apple::getColor);
        // 获取所有的重量
        obtainNature(appleList, apple -> apple.getWeight() + "");
        // 获取所有的价格
        obtainNature(appleList, apple -> apple.getPrice() + "");

    }

    /**
     * 获取属性并返回
     *
     * @param appleList
     * @param function
     * @return
     */
    private static List<String> obtainNature(List<Apple> appleList, Function<Apple, String> function) {
        List<String> result = new ArrayList<>();
        for (Apple a : appleList) {
            result.add(function.apply(a));
        }

        return result;
    }

}
