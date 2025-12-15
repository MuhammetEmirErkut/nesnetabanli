package RectangleProject.src.test;

import RectangleProject.src.model.Rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 30);
        System.out.println("\n\n" + rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.toString());
    }
}
