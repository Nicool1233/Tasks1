import java.util.Scanner;
 
public class Task7 {
    public static void main(String[] args) {
        int i = 1;
        double x, t, sum, fact, add;
        fact = 1; // Факториал
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextFloat(); // Степень, в которую возвели экспоненту
        t = scanner.nextFloat(); // Точность
        add = t + 1;
        sum = 1;
        while (t < add) { // Пока точность меньше слагаемого
            add = Math.pow(x, i) / fact;
            sum += add;
            i++;
            fact *= i;
            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
 // 1 0,0001