package Limitation;

public class test2 {
    public static void main(String[] args) {
        NumberPair<Integer,Double> pair = new NumberPair<Integer,Double>(1, 2.0);
        double sum=pair.sum();
        System.out.println(sum);
    }
}
