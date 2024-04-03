package Homework6;
class IllegalTriangleException extends Exception {
    public IllegalTriangleException() {
        System.out.println("Triangle cannot be created using these sides");
    }
}

class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0 || side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalTriangleException();
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Triangle triangle1 = new Triangle(3, 4, 5);
            System.out.println("Triangle 1 created.");
            Triangle triangle2 = new Triangle(5, 5, 5);
            System.out.println("Triangle 2 created.");
            Triangle triangle3 = new Triangle(0, 4, 5);
            System.out.println("Triangle 3 created.");
            Triangle triangle4 = new Triangle(4, 4, 4);
            System.out.println("Triangle 4 created.");
            Triangle triangle5 = new Triangle(2, 2, 2);
            System.out.println("Triangle 5 created.");
        } catch (IllegalTriangleException e) {
            System.out.println("Failed to create a triangle due to illegal sides.");
        }
    }
}

