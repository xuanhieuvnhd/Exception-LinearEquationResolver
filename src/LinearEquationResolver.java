import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Giai phuong trinh bac nhat");
        System.out.print("Cho phuong trinh la 'a * x + b = 0', vui long nhap hang so: \n");
        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        if (a != 0) {
            double solution = -b / a;
            System.out.printf("Phuong trinh co nghiem la: %f!", solution);
        } else {
            if (b == 0) {
                System.out.print("Phuong trinh vo so nghiem!");
            } else {
                System.out.print("Phuong trinh vo nghiem!");
            }
        }
    }
}
