package Test01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

//被点到的学生不会再被点到，点我所有人则重新开始
public class selection3 {
    public static void main(String[] args) {
        //1.定义集合
        ArrayList<String> list1=new ArrayList<>();
        //2.添加数据
        Collections.addAll(list1,"张三","李四","王五","赵六","田七","范钱","范见","徐明浩","徐咪好","徐小八");
        //创建临时集合
        ArrayList<String> list2=new ArrayList<>();
        //3.获取集合的长度
        int count= list1.size();
        //外循环表示轮数
        for (int i = 0; i < 10; i++) {
            System.out.println("------------这是第"+i+"轮点名------------");
            //4.随机点名
            Random r=new Random();
            //内循环表示抽取过程
            for (int j = 0; j < count; j++) {
                int index=r.nextInt(list1.size());
                String name=list1.remove(index);
                list2.add(name);
                System.out.println(name);
            }
            //表示一轮点名结束
            list1.addAll(list2);
            list2.clear();
        }


    }
}
