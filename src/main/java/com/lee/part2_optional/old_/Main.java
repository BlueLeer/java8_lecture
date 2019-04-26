package com.lee.part2_optional.old_;


/**
 * @author WangLe
 * @date 2019/4/26 11:14
 * @description
 */
public class Main {
    public static void main(String[] args) {
        People people = new People("张三", new Car());

    }

    // 方式一:深层质疑
    private static String getInsuranceName(People people) {
        if (null != people) {
            if (null != people.getCar()) {
                if (null != people.getCar().getInsurance()) {
                    if (null != people.getCar().getInsurance().getName()) {
                        return people.getCar().getInsurance().getName();
                    }
                }
            }
        }

        return "未知车险名称";

    }

    // 方式二:使用多处退出语句


}
