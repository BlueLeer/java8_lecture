package com.lee.part0_lambda;

/**
 * Created with : IntelliJ IDEA
 * User : KingIsHappy
 * Date : 2019/4/19
 * Description :
 */
public class Student implements Comparable{
    // 姓名
    private String name;
    // 身高
    private Double weight;

    public Student() {
    }

    public Student(String name, Double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
