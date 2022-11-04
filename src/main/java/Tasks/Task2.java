package Tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double x, y, z;
        Scanner scanner = new Scanner(System.in); // Инициализируем считывание с клавиатуры
        x = scanner.nextFloat(); // Считывание вещественного числа
        y = scanner.nextFloat();
        z = scanner.nextFloat();
        System.out.println(x * y * z);  // Произведение
        System.out.println((x + y + z) / 3.0); // Среднее арифметическое
        // Узнаём, как числа идут в порядке возрастания
        if (x > y && x > z){
            if (y > z){
                System.out.println(z+" " +y +" " + x);
            } else {
                System.out.println(y+" " +z +" " + x);
            }
        } else if (y > z){
            if (x > z) {
                System.out.println(z+" " +x +" " + y);

            } else {
                System.out.println(x+" " +z +" " + y);
            }
        } else {
            if (x > y){
                System.out.println(y+" " +x +" " + z);
            } else {
                System.out.println(x+" " +y +" " + z);
            }
        }
  }
}

// 5,85 4,67 7,87