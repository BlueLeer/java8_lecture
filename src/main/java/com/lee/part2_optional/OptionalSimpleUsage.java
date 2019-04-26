package com.lee.part2_optional;

import com.lee.part2_optional.new_.Insurance;

import java.util.Optional;

/**
 * @author WangLe
 * @date 2019/4/19 14:33
 * @description
 */
public class OptionalSimpleUsage {
    public static void main(String[] args) {
//        Insurance insurance = null;
//        System.out.println(insurance.getFee()); //空指针异常
        Optional<Insurance> insuranceOptional = Optional.empty();
        System.out.println(insuranceOptional.get().getFee());
    }
}
