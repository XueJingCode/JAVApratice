package Dynamic_Array;

import java.util.Random;

public class test {
    public static void main(String[] args) {
        // 1. 声明并实例化：指定这个数组只装 Double 类型
        DynamicArray<Double> arr=new DynamicArray<>();
        Random rnd=new Random();
        // 2. 随机生成数组长度 (1 到 100)
        int size=1+rnd.nextInt(100);
        // 3. 循环添加随机数
        for (int i = 0; i < size; i++) {
            arr.add(Math.random());
        }
        // 4. 随机获取一个元素
        Double d=arr.get(rnd.nextInt(size));
        System.out.println(d);
    }
}
