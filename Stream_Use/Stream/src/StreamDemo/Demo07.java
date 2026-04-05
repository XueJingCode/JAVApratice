package StreamDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class Demo07 {
    public static void main(String[] args) {
        //1.distint 去重,依赖 equals()方法和hashCode()方法，自定义数据类必须重写equals()和hashCode()方法
        //。contact 合并两个流为一个

        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"张三","徐明浩","张三","老八","小棉花","香香","赵六","云端","哈哈哈","哦");

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"张元英","刘智敏");
        System.out.println("------------------");
        //distinct 去重
        list1.stream().distinct().forEach(System.out::println);
        System.out.println("------------------");

        //contact 合并两个流为一个
        Stream.concat(list1.stream(), list2.stream()).forEach(System.out::println);
    }
}
