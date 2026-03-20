package Compare;

public class CompUtil {
    public static Object max(MyComparable[] objs) {
        if (objs == null || objs.length == 0) {
            return null;
        }
        MyComparable max = objs[0];
        for (int i = 1; i < objs.length; i++) {
            if (max.compareTo(objs[i]) < 0) {
                max = objs[i];
            }
        }
        return max;
    }

    public static void sort(MyComparable[] objs) {
//        for (int i = 0; i < objs.length; i++) {
//            int min = i;
//            for (int j = i + 1; j < objs.length; j++) {
//                if (objs[j].compareTo(objs[min]) < 0) {
//                    min = j;
//                }
//            }
//            if (min != i) {
//                MyComparable temp = objs[i];
//                objs[i] = objs[min];
//                objs[min] = temp;
//            }
//        }
//交换次数少（最多 n-1 次）
        for(int i=0;i<objs.length;i++){
            for(int j=i+1;j<objs.length;j++){
                if(objs[j].compareTo(objs[i])<0){
                    MyComparable temp=objs[i];
                    objs[i]=objs[j];
                    objs[j]=temp;
                }
            }
        }
    }
//交换次数多（最坏 O(n²) 次），冒泡排序

}
