package it.epicode.month1.week1.d3.ex1;

public class Exercise1 {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(150, 100);
        Rectangle rectangle2 = new Rectangle(200, 100);

        System.out.println(rectangle.calcArea());
        System.out.println(rectangle.calcPerimeter());

        rectangle.printRectangle();

        System.out.println();

        rectangle.printTwoRectangles(rectangle, rectangle2);
    }

}
