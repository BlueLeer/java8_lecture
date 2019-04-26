package com.lee.part2_optional.new_;

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






    /*
        发现 Optional 是如何?富你模型的语义了吧。代码中 person 引用的是 Optional<Car> ，
    而 car 引用的是 Optional<Insurance> ，这种方式非常清晰地表达了你的模型中一个 person
    可能?有也可能没有 car 的情形，同样， car 可能进行了保险，也可能没有保险。
        与此同时，我们看到 insurance 公?的名称被声明成 String 类型，而不是 Optional-
    <String> ，这非常清楚地表明声明为 insurance 公?的类型必须提供公司名称。使用这种方式，
    一旦解引用 insurance 公司名称时发生 NullPointerException ，你就能非常确定地知道出错
    的原因，不再需要为其添加 null 的?查，因为 null 的?查只会??问题，并未真正地修复问题。
    insurance 公司必须有个名字，所以，如果你遇到一个公?没有名称，你需要调查你的数据出了
    什么问题，而不应该再添加一段代码，将这个问题隐藏。
     */
}
