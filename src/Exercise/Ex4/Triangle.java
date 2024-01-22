package Exercise.Ex4;

// Lớp con Triangle kế thừa từ lớp Shape
public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    // Phương thức khởi tạo không tham số
    public Triangle() {
        super(); // Gọi phương thức khởi tạo của lớp cha
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    // Phương thức khởi tạo với ba tham số
    public Triangle(double side1, double side2, double side3) {
        super(); // Gọi phương thức khởi tạo của lớp cha
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Phương thức truy cập cho các cạnh
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

    // Phương thức tính diện tích của tam giác
    public double getArea() {
        // Sử dụng công thức Heron để tính diện tích
        double s = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Phương thức tính chu vi của tam giác
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // Phương thức toString
    @Override
    public String toString() {
        return super.toString() + ", Sides: " + side1 + ", " + side2 + ", " + side3;
    }
}
