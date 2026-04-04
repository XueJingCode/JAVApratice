package Test01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
//随机点名器
public class selection1 {
    public static void main(String[] args) {
        //1.定义集合
        ArrayList<String> list=new ArrayList<>();
        //2.添加数据
        Collections.addAll(list,"张三","李四","王五","赵六","田七","范钱","范见","徐明浩","徐咪好","徐小八");
        //3.随机点名
        Random r=new Random();
        int index=r.nextInt(list.size());

        String s= list.get(index);
        System.out.println(s);
    }
}
