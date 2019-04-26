package com.lee.part0_lambda_function_reference;

/**
 * Created with : IntelliJ IDEA
 * User : KingIsHappy
 * Date : 2019/4/19
 * Description :
 */
public class Apple {
    // 颜色
    private String color;
    // 重量
    private Double weight;
    // 价格
    private Double price;

    public Apple() {
    }

    public Apple(String color, Double weight, Double price) {
        this.color = color;
        this.weight = weight;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}
