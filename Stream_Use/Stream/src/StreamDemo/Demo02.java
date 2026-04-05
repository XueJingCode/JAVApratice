package StreamDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Demo02 {
    public static void main(String[] args) {
        //1.单列集合使用Collection创建流
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"a","c","b","d","t");

        list1.stream().forEach(System.out::println);
    }
}
