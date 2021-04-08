import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        // In ra mặc định
        Circle circle = new Circle();
        System.out.println(circle);

        // In ra Circle đã thay đổi khi thay đổi thuộc tính
        Circle circle1 = new Circle(3, "blue");
        System.out.println(circle1);

        // Thay đổi và in ra Circle khi thay đổi qua setCircle
        Circle circle2 = new Circle();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập radius mới: ");
        int radius = scanner.nextInt();
        circle2.setRadius(radius);

        System.out.println("Nhập color mới: ");
        scanner.nextLine();
        String color = scanner.nextLine();
        circle2.setColor(color);

        System.out.println(circle2);
    }
}
