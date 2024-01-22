package Exercise.Ex4;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean checked=false;
        double side1,side2,side3;
        // Nhập độ dài ba cạnh từ người dùng
        do {
            System.out.print("Nhập cạnh 1: ");
            side1 = scanner.nextDouble();

            System.out.print("Nhập cạnh 2: ");
            side2 = scanner.nextDouble();

            System.out.print("Nhập cạnh 3: ");
            side3 = scanner.nextDouble();
            if (side1<=0||side2<=0||side3<0||side1+side2<=side3||side1+side3<=side2||side2+side3<=side1){
                System.out.println("Nhập sai độ dài cạnh");
            } else {
                checked=true;
            }
        } while (!checked);


        // Nhập màu sắc từ người dùng
        System.out.print("Nhập màu sắc: ");
        String color = scanner.next();

        // Tạo đối tượng Triangle
        Triangle triangle = new Triangle(side1, side2, side3);

        // Đặt màu sắc cho tam giác
        triangle.setColor(color);

        // Hiển thị thông tin tam giác
        System.out.println("Thông tin tam giác:");
        System.out.println(triangle.toString());
        System.out.println("Diện tích: " + triangle.getArea());
        System.out.println("Chu vi: " + triangle.getPerimeter());

        scanner.close();
    }
}
