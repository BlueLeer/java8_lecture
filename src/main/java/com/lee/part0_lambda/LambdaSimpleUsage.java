package com.lee.part0_lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created with : IntelliJ IDEA
 * User : KingIsHappy
 * Date : 2019/4/19
 * Time : 1:50
 * Description :
 */
public class LambdaSimpleUsage {
    public static void main(String[] args) {
        // 两个学生:张三和李四
        Student student1 = new Student("张三", 1.75);
        Student student2 = new Student("李四", 1.81);
        List<Student> students = Arrays.asList(student1, student2);

        //****************************************************************
        // 根据两个人的身高进行排序
        // 定义一个身高比较器
        Comparator<Student> studentComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        };

        students.sort(studentComparator);
        //****************************************************************
        // 使用lambda表达式来完成
        Comparator<Student> studentComparator2 = (o1, o2) -> o1.getWeight().compareTo(o2.getWeight());
        students.sort(studentComparator2);


        //****************************************************************

    }
}
