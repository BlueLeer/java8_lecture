package com.lee.part0_lambda_function_reference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/** 方法引用简单示例
 * @author WangLe
 * @date 2019/4/19 10:59
 * @description 需求:按照苹果的重量排序
 */
public class FunctionReferenceSimpleUsage {
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

        // 使用lambda表达式
        appleList.sort(Comparator.comparing((apple) -> apple.getWeight()));


        // 使用方法引用
        appleList.sort(Comparator.comparing(Apple::getWeight));

    }
}
