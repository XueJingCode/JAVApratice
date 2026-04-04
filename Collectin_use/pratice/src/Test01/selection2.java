package Test01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

//随机点名器，70%概率男生，30%概率女生
//1.1111111000
//抽1或0
public class selection2 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<Integer> list=new ArrayList<>();
        //2.添加元素
        Collections.addAll(list,1,1,1,1,1,1,1);
        Collections.addAll(list,0,0,0);
        //3.打乱集合中的数据
        Collections.shuffle(list);
        //4.从list集合中随机抽0或者1
        Random r=new Random();
        int index=r.nextInt(list.size());
        int number= list.get(index);

        //5.创建两个集合，分别存储男女的名字
        ArrayList<String> girllist=new ArrayList<>();
        ArrayList<String> boylist=new ArrayList<>();

        Collections.addAll(girllist,"郑伊安","Stella","betty","湊崎沙夏");
        Collections.addAll(boylist,"王五","赵六","田七","范钱","范见","徐明浩","徐咪好","徐小八");

        //6.判断
        if(number==1){
            int boyIndex=r.nextInt(boylist.size());
            System.out.println(boylist.get(boyIndex));
        }else {
            int girlIndex = r.nextInt(girllist.size());
            System.out.println(boylist.get(girlIndex));
        }

    }
}
