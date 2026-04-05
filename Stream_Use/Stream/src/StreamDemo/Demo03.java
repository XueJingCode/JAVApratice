package StreamDemo;

import java.util.HashMap;

public class Demo03 {
    public static void main(String[] args) {
        //双列集合获取Stream流的三种方式
        HashMap<String, String> map = new HashMap<>();
        map.put("aaa", "柳智敏");
        map.put("bbb", "张元英");
        map.put("ccc", "金冬天");
        map.put("ddd", "安宥真");

        //1.通过keySet()获取
        map.keySet().stream().forEach(key -> System.out.println(key));
        System.out.println("------------------");
        //2.通过values()获取
        map.values().stream().forEach(value -> System.out.println(value));
        System.out.println("------------------");
        //3.通过entrySet()获取
        map.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + "=" + entry.getValue()));
    }

}
