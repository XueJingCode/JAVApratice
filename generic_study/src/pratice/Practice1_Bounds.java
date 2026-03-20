package pratice;

import java.util.ArrayList;
import java.util.List;

// 1. 定义一个泛型类，限制 T 必须是 Number 或其子类
class stats<T extends Number>{
    private List<T> numbers = new ArrayList<>();
    public void add(T n){
        numbers.add(n);
    }
    // 2. 计算总和，利用 Number 的 doubleValue() 方法
    public double sum(){
        double sum = 0.0;
        for (T n : numbers) {
            sum += n.doubleValue();//只有限定了 extends Number 才能调用此方法
        }
        return sum;
    }
}

public class Practice1_Bounds {
    public static void main(String[] args) {
        stats<Integer> stats = new stats<>();
        stats.add(1);
        stats.add(2);
        stats.add(3);
        System.out.println("Integer Sum: "+stats.sum());

        stats<Double> stats2 = new stats<>();
        stats2.add(1.0);
        stats2.add(2.0);
        System.out.println("Double Sum: "+stats2.sum());

//        Stats<String> stringStats = new Stats<>();
//        stringStats.add("Hello"); // 编译器会报错：String 不是 Number 的子类
    }

}
