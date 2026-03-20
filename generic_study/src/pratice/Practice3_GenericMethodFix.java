package pratice;

import java.util.ArrayList;
import java.util.List;

class Container<T> {
    private List<T> data = new ArrayList<>();
    public void add(T t) { data.add(t); }
    public T get(int i) { return data.get(i); }
    public void set(int i, T t) { data.set(i, t); }
    public int size() { return data.size(); }
}

public class Practice3_GenericMethodFix {

    // 外部接口：使用通配符，兼容性强，可以接收 Container<Integer>, Container<String> 等
    public static void swap(Container<?> c, int i, int j) {
        // 直接在这里写 c.set(...) 会报错，因为 ? 是未知类型
        // 解决方案：调用内部的泛型辅助方法
        swapHelper(c, i, j);
    }

    // 内部实现：使用类型参数 <T>，此时 T 是一个确定的具体类型
    private static <T> void swapHelper(Container<T> c, int i, int j) {
        T temp = c.get(i);
        c.set(i, c.get(j));
        c.set(j, temp);
    }

    public static void main(String[] args) {
        Container<String> words = new Container<>();
        words.add("A");
        words.add("B");
        words.add("C");

        System.out.println("Before: " + words.get(0) + ", " + words.get(1));

        // 成功交换！虽然传入的是 Container<?>，但内部通过泛型方法推断出了 T=String
        swap(words, 0, 1);

        System.out.println("After: " + words.get(0) + ", " + words.get(1));
    }
}
