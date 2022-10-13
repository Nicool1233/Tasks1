import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        double a, b, c, d, e, f, x, y;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextFloat();
        b = scanner.nextFloat();
        c = scanner.nextFloat();
        d = scanner.nextFloat();
        e = scanner.nextFloat();
        f = scanner.nextFloat();
        y = (f -(d * c / a)) / (e - (b * d / a)); // Выводится из двух систем линейных уравнений
        x = (c - b * y) / a;
        System.out.println("x:" + x);
        System.out.println("y:" + y);
    }
}
// Ввести следующие числа для проверки
// 3 5 8 7 1 8
// Что обозначают эти числа: (должны быть корни 1 и 1)
// 3x + 5y = 8
// 7x + y = 8