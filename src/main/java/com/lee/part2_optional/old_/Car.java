package com.lee.part2_optional.old_;

/**
 * @author WangLe
 * @date 2019/4/19 14:25
 * @description
 */
public class Car {
    private String name;
    private Insurance insurance;

    public Car() {
    }

    public Car(String name, Insurance insurance) {
        this.name = name;
        this.insurance = insurance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", insurance=" + insurance +
                '}';
    }
}
