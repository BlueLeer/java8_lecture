package com.lee.part2_optional.new_;

import java.util.Optional;

/**
 * @author WangLe
 * @date 2019/4/19 14:25
 * @description
 */
public class Car {
    private String name;
    private Optional<Insurance> insurance;

    public Car() {
    }

    public Car(String name, Optional<Insurance> insurance) {
        this.name = name;
        this.insurance = insurance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<Insurance> getInsurance() {
        return insurance;
    }

    public void setInsurance(Optional<Insurance> insurance) {
        this.insurance = insurance;
    }
}
