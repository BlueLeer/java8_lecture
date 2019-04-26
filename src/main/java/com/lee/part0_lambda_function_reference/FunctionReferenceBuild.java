package com.lee.part0_lambda_function_reference;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author WangLe
 * @date 2019/4/19 11:21
 * @description
 */
public class FunctionReferenceBuild {
    public static void main(String[] args) {
        // 静态方法 TODO: 改造成方法引用
        Function<Integer, String> function_0 = i -> String.valueOf(i);
        // 实例方法 TODO: 改造成方法引用
        Function<Apple, String> function_1 = Apple::getColor;
        //
    }
}
