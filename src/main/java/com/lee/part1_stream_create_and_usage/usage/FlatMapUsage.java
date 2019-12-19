package com.lee.part1_stream_create_and_usage.usage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author WangLe
 * @date 2019/4/22 15:54
 * @description 需求, 统计Dish.txt文件中出现的所有的字符(重复的只算一次)
 */
public class FlatMapUsage {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D:\\lee_java\\java8_lecture\\src\\main\\java\\com\\lee\\part1_stream_create_and_usage\\Dish.txt");
        try (
                Stream<String> lines = Files.lines(path)
        ) {
            long count = lines
                    .map(line -> line.split(""))
                    .flatMap(strings -> Arrays.stream(strings))
                    .count();

            // 关于 flatMap方法的逻辑可以看下面这两行代码
            // Stream<String[]> a = lines.map(line -> line.split("a"));
            // Stream<String> stringStream = a.flatMap(strings -> Arrays.stream(strings));
            System.out.println(count);
        }
    }
}
