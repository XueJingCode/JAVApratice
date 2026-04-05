package StreamDemo;

import java.util.ArrayList;

public class Demo01 {
    public static void main(String[] args) {
        //1.创建一个集合
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("张三");
        list1.add("张元英");
        list1.add("李四");
        list1.add("徐明浩");
        list1.add("安安");

        //2.把所有姓张的姓名，存储到一个新的集合中，再把姓张的三个字再存储
        list1.stream().filter(name -> name.startsWith("张")).filter(name -> name.length() == 3).forEach(System.out::println);
    }
}
