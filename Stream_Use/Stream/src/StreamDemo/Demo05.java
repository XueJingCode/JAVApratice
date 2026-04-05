package StreamDemo;

import java.util.stream.Stream;

public class Demo05 {
    public static void main(String[] args) {
        //零散数据使用Stream.of创建流
        Stream.of(1, 2, 3, 4, 5).forEach(s-> System.out.println(s));
        Stream.of("张三", "张元英", "张三").forEach(s-> System.out.println(s));
    }
}
