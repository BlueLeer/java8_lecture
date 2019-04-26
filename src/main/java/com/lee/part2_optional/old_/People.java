package com.lee.part2_optional.old_;

/**
 * @author WangLe
 * @date 2019/2/22 14:23
 * @description
 */
public class People {
    private String name;
    private Car car;

    public People() {
    }

    public People(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }
}
