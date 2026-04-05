package StreamDemo;

import java.util.Arrays;

public class Demo04 {
    public static void main(String[] args) {
        //数组使用Arrays工具类中的静态方法stream创建流
        //1.创建数组
        int[] arr1 = {1, 2, 3, 4, 5};
        String[] arr2 = {"张三", "张元英", "张三"};
        //2.创建流
        Arrays.stream(arr1).forEach(s-> System.out.println(s));
        System.out.println("------------------");
        Arrays.stream(arr2).forEach(System.out::println);
    }
}
