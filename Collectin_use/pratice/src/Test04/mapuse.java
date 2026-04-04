package Test04;

import java.util.*;

//集合嵌套
public class mapuse {
    public static void main(String[] args) {
        //1.创建Map集合
        HashMap<String, ArrayList<String>> hm=new HashMap<>();

        //2.创建单列集合存储市
        ArrayList<String> city1=new ArrayList<>();
        Collections.addAll(city1,"西安","渭南","咸阳");

        ArrayList<String> city2=new ArrayList<>();
        Collections.addAll(city2,"南京","苏州","无锡");

        ArrayList<String> city3=new ArrayList<>();
        Collections.addAll(city3,"广州","深圳","顺德");

        //3.添加Map集合
        hm.put("陕西省",city1);
        hm.put("江苏省",city2);
        hm.put("广东省",city3);

        //4.遍历
        Set<Map.Entry<String, ArrayList<String>>> entries=hm.entrySet();
        for( Map.Entry<String, ArrayList<String>> entry:entries){
            String Key=entry.getKey();
            ArrayList<String> value=entry.getValue();
            StringJoiner sj=new StringJoiner(",","","");
            for(String city : value){
                sj.add(city);
            }
            System.out.println(Key + " = " +sj);

        }
    }
}
