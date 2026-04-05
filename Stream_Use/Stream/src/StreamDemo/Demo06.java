package StreamDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Demo06 {
    public static void main(String[] args) {

        //中间方法
        //1.filter 过滤
        //2.limit 截取
        //3.skip 跳过


        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三", "张元英", "张无忌", "李白", "杜甫", "王五", "谢梦");
        //filter 过滤 把姓张的留下
        //list.stream().filter(name -> name.startsWith("张")).forEach(System.out::println);
        //limit 截取 只取前面两个
        //list.stream().limit(2).forEach(System.out::println);
        //skip 跳过 跳过前面两个
        //list.stream().skip(2).forEach(System.out::println);
        //只要"张无忌", "李白"
        list.stream().limit(4).skip(2).forEach(System.out::println);
    }
}
