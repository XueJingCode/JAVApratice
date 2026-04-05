package StreamDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class Demo08 {
    public static void main(String[] args) {
        //map 转换流中的数据类型
        //1.中间方法返回新的Stream流，原来的Stream流只能使用一次，建议使用链式编程
        //2.修改Stream流中的数据,不会影响原来集合或者数组的数据

        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"张三-50","张元英-21","徐明浩-29");
        //需求：只获取年龄
        //String->int

            list1.stream().map( new Function<String, Integer>() {
            @Override
            public Integer apply(String s){
                String[] arr=s.split("-");
                return Integer.parseInt(arr[1]);
            }
            }).forEach(System.out::println);

            //优化
        list1.stream().map(s->Integer
                .parseInt(s.split("-")[1]))
                .forEach(System.out::println);
    }
}
