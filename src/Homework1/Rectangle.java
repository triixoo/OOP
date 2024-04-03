package Homework1;

public class Rectangle {
    private double width;
    double height;
    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }
    public Rectangle(){
        height = 0.0;
        width = 0.0;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea() {
        return (width * height);
    }
    public double getPerimeter(){
        return 2 * (width + height);
    }
}
