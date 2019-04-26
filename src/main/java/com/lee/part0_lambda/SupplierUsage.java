package com.lee.part0_lambda;

import java.util.function.Supplier;

/**
 * Created with : IntelliJ IDEA
 * User : KingIsHappy
 * Date : 2019/4/19
 * Description :
 */
public class SupplierUsage {
    public static void main(String[] args) {
        // 提供当前的日期的时间戳
        Supplier<Long> supplier = () -> System.currentTimeMillis();
        // 提供一些一样的苹果
        Supplier<Apple> appleSupplier = () -> new Apple("red", 200D, 3.45D);


    }
}
