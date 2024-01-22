package Exercise.Ex1;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder [radius=" + getRadius() + ", color=" + getColor() + ", height=" + height + "]";
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5.0, "Blue", 10.0);
        System.out.println("Cylinder Details:");
        System.out.println(cylinder);
        System.out.println("Volume: " + cylinder.getVolume());
    }
}
