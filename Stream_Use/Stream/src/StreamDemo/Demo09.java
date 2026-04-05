package StreamDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo09 {
    public static void main(String[] args) {
        //终结方法
        //1.forEach 遍历
        //2.long count() 统计个数
        //3.toArray() 把流中的数据转换成数组

        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"张三","张元英","徐明浩");
        //forEach
        //list1.stream().forEach(System.out::println);
        // count
        //System.out.println(list1.stream().count());

        //toArray
        //Object[] arr1 = list.stream().toArray();
        //System.out.println(Arrays.toString(arr1));

        //IntFunction的泛型：具体类型的数组
        //apply的形参:流中数据的个数，要跟数组的长度保持一致
        //apply的返回值：具体类型的数组
        //方法体：就是创建数组


        //toArray方法的参数的作用：负责创建一个指定类型的数组
        //toArray方法的底层，会依次得到流里面的每一个数据，并把数据放到数组当中
        //toArray方法的返回值：是一个装着流里面所有数据的数组
       /* String[] arr = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });

        System.out.println(Arrays.toString(arr));*/

        String[] arr2 = list1.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(arr2));

    }
}
