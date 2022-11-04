package Tasks;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) { // Тоже самое, но для целых чисел
        int x, y, z;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();
        System.out.println(x * y * z);
        System.out.println((x + y + z) / 3.0);
        if (x > y && x > z){
            if (y > z){
                System.out.println(z);
                System.out.println(y);
                System.out.println(x);
            } else {
                System.out.println(y);
                System.out.println(z);
                System.out.println(x);
            }
        } else if (y > z){
            if (x > z) {
                System.out.println(z);
                System.out.println(x);
                System.out.println(y);
            } else {
                System.out.println(x);
                System.out.println(z);
                System.out.println(y);
            }
        } else {
            if (x > y){
                System.out.println(y);
                System.out.println(x);
                System.out.println(z);
            } else {
                System.out.println(x);
                System.out.println(y);
                System.out.println(z);
            }
        }
  }
}
// 1 2 5