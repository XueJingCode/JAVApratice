package pratice;

import java.util.ArrayList;
import java.util.List;

public class Practice2_WildcardTrap {

    // 接收任何类型的 List
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();

        // 【错误演示】：尝试添加元素
        // list.add("New Item"); // 编译错误！编译器不知道具体类型，为了安全禁止添加
        // list.add(123);        // 编译错误！
       // list.add(null); // 只有 null 是允许的
    }

    // 接收 Number 及其子类的 List
    public static double sumList(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;

        // 【错误演示】：即使是 Number 的子类也不能添加
        // list.add(10); // 编译错误！因为传入的可能是 List<Integer>，加 Double 会破坏类型安全
    }

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);

        List<Double> doubles = new ArrayList<>();
        doubles.add(1.1);
        doubles.add(2.2);

        printList(ints);
        printList(doubles);

        System.out.println("Sum Ints: " + sumList(ints));
        System.out.println("Sum Doubles: " + sumList(doubles));
    }
}