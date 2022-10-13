import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        double start, end, step; // Задаём начало, конец отрезка, а также шаг, с которым вычисляется синус
        Scanner scanner = new Scanner(System.in);
        start = scanner.nextFloat();
        end = scanner.nextFloat();
        step = scanner.nextFloat();
        for (double i = start; i < end; i = i + step){
            System.out.println("sin(" + i + ") = " + Math.sin(i));
        }
    }
}
// 0 1 0,1