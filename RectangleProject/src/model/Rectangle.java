package RectangleProject.src.model;

public class Rectangle {
    private float width;
    private float height;

    public Rectangle(float width, float height) {
        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public void setWidth(float width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width must be greater than 0");
        }else if (width > 20) {
            throw new IllegalArgumentException("Width must be less than 20");
        }else{
            this.width = width;
        }
    }
    public void setHeight(float height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be greater than 0");
        }else if (height > 20) {
            throw new IllegalArgumentException("Height must be less than 20");
        }else{
            this.height = height;
        }
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2 * (width + height);
    }
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + "]";
    }
}
