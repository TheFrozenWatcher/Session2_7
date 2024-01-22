package Exercise.Ex4;
import java.util.Scanner;

// Lớp cha Shape
public class Shape {
    private String color;

    // Phương thức khởi tạo không tham số
    public Shape() {
        this.color = "unknown";
    }

    // Phương thức khởi tạo với một tham số
    public Shape(String color) {
        this.color = color;
    }

    // Phương thức truy cập màu sắc
    public String getColor() {
        return color;
    }

    // Phương thức cài đặt màu sắc
    public void setColor(String color) {
        this.color = color;
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "Color: " + color;
    }
}

