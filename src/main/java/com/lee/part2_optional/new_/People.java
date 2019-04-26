package com.lee.part2_optional.new_;

import java.util.Optional;

/**
 * @author WangLe
 * @date 2019/2/22 14:23
 * @description
 */
public class People {
    private String name;
    private Optional<Car> car;

    public People() {
    }

    public People(String name, Optional<Car> car) {
        this.name = name;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<Car> getCar() {
        return car;
    }

    public void setCar(Optional<Car> car) {
        this.car = car;
    }
}
