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

    private static String getInsuranceName(People p) {
        Optional<People> people = Optional.ofNullable(p);
        return people
                .flatMap(People::getCar)
                .flatMap(Car::getInsurance)
                .map(Insurance::getName)
                .orElse("未知名称");

    }
}
