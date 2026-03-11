package Herit;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----new Child()");
        Child c = new Child();
        //父类、子类静态代码块-父类实例代码块-父类构造方法-子类实例代码块-子类构造方法
        System.out.println("\n---c.action");
        c.action();
        //子类可以调用父类的方法
        Base b = c;//编译看左，运行看右
        System.out.println("-----b.action");
        b.action();
        //运行时调用子类的重写方法
        System.out.println("\n---b.s:" + b.s);
        System.out.println("\n---c.s:" + c.s);
    }
}
