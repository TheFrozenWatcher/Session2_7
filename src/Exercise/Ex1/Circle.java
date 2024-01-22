package Exercise.Ex1;

public class Circle{
    private double radius;
    private String color;
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", color=" + color + "]";
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "Red");
        System.out.println("Circle Details:");
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
    }

}
