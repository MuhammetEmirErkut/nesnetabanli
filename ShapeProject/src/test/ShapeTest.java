package ShapeProject.src.test;

import ShapeProject.src.model.Square;
import ShapeProject.src.model.Rectangle;
import ShapeProject.src.model.Circle;

public class ShapeTest {
    public static void main(String[] args) {
        Square square = new Square(10);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        System.out.println(square.getName());
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getName());
        Circle circle = new Circle(10);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getName());
    }
}
