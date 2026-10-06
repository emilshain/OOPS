abstract class Shape {
    abstract void noOfSides();
}

class Rectangle extends Shape {
    void noOfSides() {
        System.out.println("Number of sides for Rectangle: 4");
    }
}

class Triangle extends Shape {
    void noOfSides() {
        System.out.println("Number of sides for Triangle: 3");
    }
}

class Hexagon extends Shape {
    void noOfSides() {
        System.out.println("Number of sides for Hexagon: 6");
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape s1 = new Rectangle();
        s1.noOfSides();

        Shape s2 = new Triangle();
        s2.noOfSides();

        Shape s3 = new Hexagon();
        s3.noOfSides();
    }
}
