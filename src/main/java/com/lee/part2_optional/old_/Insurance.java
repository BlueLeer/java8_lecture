package com.lee.part2_optional.old_;

/**
 * @author WangLe
 * @date 2019/2/22 14:21
 * @description
 */
public class Insurance {
    private String name;
    private Double fee;


    public Insurance() {
    }

    public Insurance(String name, Double fee) {
        this.name = name;
        this.fee = fee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Insurance{" +
                "name='" + name + '\'' +
                ", fee=" + fee +
                '}';
    }
}
