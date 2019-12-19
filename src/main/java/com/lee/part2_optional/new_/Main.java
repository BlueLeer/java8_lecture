package com.lee.part2_optional.new_;

import java.util.Optional;

/**
 * @author WangLe
 * @date 2019/4/26 11:26
 * @description
 */
public class Main {
    public static void main(String[] args) {
        People people = new People();

        System.out.println(getInsuranceName(people));
    }

    /**
     * 关于 Optional 的map()和flatMap()方法的区别和用法
     *
     * @param p
     * @return
     */
    private static String getInsuranceName(People p) {
        // map获取未被optional包装的值,并将值用optional包装起来并返回
//        Optional<Car> car = Optional.ofNullable(p).map(People::getCar);
        //而flatMap是为了获取被Optional包装的值,并返回
//        Optional<Integer> optionalInteger = Optional.ofNullable(p).flatMap(People::getAge);


        // 获取保险名称
        String s = Optional.ofNullable(p)
                .map(People::getCar)
                .map(Car::getInsurance)
                .map(Insurance::getName)
                .orElse("哈哈哈,不存在啦");
//        System.out.println(s);

        return s;

    }
}
