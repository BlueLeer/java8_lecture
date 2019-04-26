package com.lee.part1_stream_create_and_usage.create;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

/**
 * @author WangLe
 * @date 2019/2/21 13:41
 * @description 获得Stream的几种方式
 */
public class CreateStream {
    public static void main(String[] args) throws IOException {
        // 从列表中获取(常用)
        createStreamFromCollections();
        // 从集合中获取
        createStreamFromSet();
        //从数组中获取
        createStreamFromArrays();
        // 从文件中获取
        createStreamFromFile();

        // 从迭代器中创建
//        createStreamFromIterate().forEach(System.out::println);
        // 从generator中获取
        createStreamFromGenerator().forEach(System.out::println);
    }

    /**
     * 通过列表获取Stream
     *
     * @return
     */
    private static Stream<String> createStreamFromCollections() {
        List<String> strings = Arrays.asList("Hello", "Java", "8", "!");
        return strings.stream();
    }

    private static Stream<String> createStreamFromSet() {
        Set<String> strings = Collections.emptySet();
        strings.addAll(Arrays.asList("Hello", "Java", "8", "!"));
        return strings.stream();
    }

    /**
     * 从数组中创建Stream
     *
     * @return
     */
    private static Stream<String> createStreamFromArrays() {
        String[] strings = {"Hello", "Java", "8", "!"};
        return Stream.of(strings);
    }

    private static void createStreamFromFile() throws IOException {
        Path path = Paths.get("D:\\lee_java\\java8\\java8\\src\\main\\java\\com\\lee\\java8\\streams\\Dish.java");
        Path pathResult = Paths.get("D:\\lee_java\\java8\\java8\\src\\main\\java\\com\\lee\\java8\\streams\\Dish.txt");

        try (
                Stream<String> lines = Files.lines(path);
                FileWriter fileWriter = new FileWriter(pathResult.toFile())
        ) {
            lines.forEach(s -> {
                try {
                    fileWriter.write(s);
                    // 写入换行
                    fileWriter.write("\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }
    }

    /**
     * 通过Stream的静态方法iterate,使用迭代的方法产生的
     *
     * @return
     */
    private static Stream<Double> createStreamFromIterate() {
//        String ss = "hello";
//        Stream.iterate("Hello",s-> s+ss);
        return Stream.iterate(2.0, d -> d * 2.0).limit(20);
    }

    /**
     * 通过Stream的静态方法generate,使用Supplier进行提供
     *
     * @return
     */
    private static Stream<Double> createStreamFromGenerator() {
        return Stream.generate(Math::random).limit(10);
    }
}
