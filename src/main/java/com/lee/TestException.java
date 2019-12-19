package com.lee;

/**
 * @author WangLe
 * @date 2019/12/19 15:01
 * @description
 */
public class TestException {
    public static void main(String[] args) {
        try {
            testException1();
        }catch (Exception e) {
            System.out.println("捕获到异常了,我要继续执行了");
        }

        System.out.println("111");
        System.out.println("222");
        System.out.println("333");
    }

    private static void testException1() throws Exception {
        throw new Exception("哈哈,我是测试异常");
    }
}
