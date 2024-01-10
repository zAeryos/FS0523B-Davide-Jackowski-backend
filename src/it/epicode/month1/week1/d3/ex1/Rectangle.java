package it.epicode.month1.week1.d3.ex1;

public class Rectangle {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calcPerimeter() {
        return (width * 2) + (height * 2);
    }

    public double calcArea() {
        return width * height;
    }

    public void printRectangle() {
        System.out.println("The perimeter of the rectangle is: " + calcPerimeter());
        System.out.println("The area of the rectangle is: " + calcArea());
    }

    public void printTwoRectangles(Rectangle r1, Rectangle r2) {
        r1.printRectangle();
        r2.printRectangle();

        System.out.println("The summed perimeter of the two rectangles is:  " + (r1.calcPerimeter() + r2.calcPerimeter()));
        System.out.println("The summed area of the two rectangles is: " + (r1.calcArea() + r2.calcArea()));
    }

}
