package com.lee.part1_stream_why_use_stream.example_1.filterFunction;

/**
 * Created with : IntelliJ IDEA
 * User : KingIsHappy
 * Date : 2019/4/19
 * Time : 1:29
 * Description :
 */
public class FunctionInterfaceUsage {
    public static void main(String[] args) {
        SimpleFunctionInterface functionInterface = () -> System.out.println("Hello");
        process(functionInterface);
    }

    private static void process(SimpleFunctionInterface functionInterface) {
        functionInterface.doSomething();
    }
}
