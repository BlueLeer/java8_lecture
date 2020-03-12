package com.lee.other;

import java.util.UUID;

import static java.util.UUID.*;

/**静态导入也是Java8的一个新特性
 * @author lee
 * @date 2020/3/13 0:08
 */
public class StaticImport {
    public static void main(String[] args) {
        UUID hello = fromString("hello");
    }
}
