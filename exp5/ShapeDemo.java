abstract class Shape {
    double area;

    abstract void collectInput();

    abstract void calculateArea();

    void showResult() {
        System.out.println("Area = " + area);
    }
}

class Rectangle extends Shape {
    double length, breadth;

    void collectInput() {
        System.out.println("Rectangle: length = 5, breadth = 3");
        length = 5;
        breadth = 3;
    }

    void calculateArea() {
        area = length * breadth;
    }
}

class Triangle extends Shape {
    double base, height;

    void collectInput() {
        System.out.println("Triangle: base = 4, height = 6");
        base = 4;
        height = 6;
    }

    void calculateArea() {
        area = 0.5 * base * height;
    }
}

class Hexagon extends Shape {
    double side;

    void collectInput() {
        System.out.println("Hexagon: side = 2");
        side = 2;
    }

    void calculateArea() {
        area = (3 * Math.sqrt(3) / 2) * side * side;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape s;

        s = new Rectangle();
        s.collectInput();
        s.calculateArea();
        s.showResult();

        s = new Triangle();
        s.collectInput();
        s.calculateArea();
        s.showResult();

        s = new Hexagon();
        s.collectInput();
        s.calculateArea();
        s.showResult();
    }
}
