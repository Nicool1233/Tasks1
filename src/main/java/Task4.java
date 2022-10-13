import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        double a, b, c, d, x1, x2;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextFloat();
        b = scanner.nextFloat();
        c = scanner.nextFloat();
        d = b * b - 4 * a * c; // Дискриминант
        if (d < 0){
            System.out.println("No roots"); // Нет корней
        } else if (d == 0) {
            System.out.println("1 root"); // 1 корень
            x1 = -b / (2 * a);
            System.out.println(x1);
        } else {
            System.out.println("2 roots"); // 2 корня
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println(x1);
            System.out.println(x2);
        }        
    }
}
