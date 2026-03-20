package pratice;

// 定义一个接口
interface Shape {
    double getArea();
}

// 定义一个普通类
class Color {
    private String name;
    public Color(String name) { this.name = name; }
    public String getName() { return name; }
}

// 一个既继承 Color 又实现 Shape 的类
class ColoredCircle extends Color implements Shape {
    private double radius;
    public ColoredCircle(String colorName, double r) {
        super(colorName);
        this.radius = r;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// 泛型类：T 必须既是 Color 的子类，又要实现 Shape 接口
class PaintedShape<T extends Color & Shape> {
    private T shape;

    public PaintedShape(T shape) {
        this.shape = shape;
    }

    public void printInfo() {
        // 可以调用 Color 的方法
        System.out.println("Color: " + shape.getName());
        // 可以调用 Shape 的方法
        System.out.println("Area: " + shape.getArea());
    }
}

public class Practice4_MultipleBounds {
    public static void main(String[] args) {
        ColoredCircle circle = new ColoredCircle("Red", 5.0);

        // 合法：ColoredCircle 既 extends Color 又 implements Shape
        PaintedShape<ColoredCircle> painted = new PaintedShape<>(circle);
        painted.printInfo();

        // 【思考题】：如果创建一个只继承 Color 但不实现 Shape 的类，能传给 PaintedShape 吗？
        // 答案：不能，编译器会报错，因为不满足 & Shape 的条件
    }
}
