package myfunction;

import java.util.Arrays;
import java.util.Comparator;

public class Demo01 {
    public static void main(String[] args) {
        //对一个数组进行倒叙输出
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};

        //匿名内部类
//        Arrays.sort(arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });

        //lambda表达式
//        Arrays.sort(arr, (o1, o2) -> o2 - o1);

        //方法引用
        Arrays.sort(arr, Demo01::subtraction);
        System.out.println(Arrays.toString(arr));

    }


    //可以是Java已经写好的，也可以是一些第三方的工具类
    public static int subtraction(int num1, int num2) {
        return num2 - num1;
    }
}
