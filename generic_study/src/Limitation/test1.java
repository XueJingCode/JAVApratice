package Limitation;

public class test1 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<String, Integer>("hi", 101);
        Pair<String, Integer> pair2 = new Pair<>("hello", 1997);
        System.out.println(pair1);
        System.out.println(pair2);
        System.out.println(pair1.getFirst());
        System.out.println(pair1.getSecond());
        System.out.println(pair2.getFirst());
        System.out.println(pair2.getSecond());
    }
}
