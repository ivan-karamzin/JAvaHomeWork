package lesson10;

public class lesson10Task1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.printInfo();

        Triangle triangle = new Triangle();
        triangle.printInfo();

        Circle circle = new Circle();
        circle.printInfo();

    }
}

     abstract class Shape {
        abstract void printInfo();
    }

     class Triangle extends Shape {
        @Override
        void printInfo() {
            System.out.println("Треугольник");
        }
    }

    class Rectangle extends Shape {
        @Override
        void printInfo() {
            System.out.println("Прямоугольник");
        }
    }

    class Circle extends Shape {
        @Override
        void printInfo() {
            System.out.println("Круг");
        }
    }
