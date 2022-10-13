import java.util.Scanner;

public class Array {
    private int c = 0;
    // Создание массива на 100 элементов
    Integer[] array = new Integer[100];
    public void outputArray() { // Вывод массива на экран
        for (int i = 0; i < c; i++) {
            System.out.println(array[i]);
        }
    }
    // Считывание чисел с клавиатуры (первое число - кол-во чисел, которое планируется ввести)
    public void inputArray() {
        Scanner scanner = new Scanner(System.in);
        int x;
        x = scanner.nextInt();
        for (int i = 0; i < x; i++) {
            array[c] = scanner.nextInt();
            c++;
        }
    }
    // Сумма чисел массива
    public void sumArray() {
        int sum = 0;
        for (int i = 0; i < c; i++) {
            sum += array[i];
        }
        System.out.println("Sum: " + sum);
    }
    // Сколько чётных чисел
    public void evenNumbers() {
        int count = 0;
        for (int i = 0; i < c; i++) {
            if (array[i] % 2 == 0)
                count += 1;
        }
        System.out.println("Even: " + count);
    }
    // Числа принадлежащие отрезку
    public void segment(int a, int b) {
        int count = 0;
        for (int i = 0; i < c; i++) {
            if (array[i] >= a && array[i] <= b)
                count += 1;
        }
        System.out.println("Segment: " + count);
    }
    // Все ли числа положительные
    public void positive() {
        boolean flag = true;
        for (int i = 0; i < c; i++) {
            if (array[i] <= 0) {
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("All numbers are positive");
        } else {
            System.out.println("Not all numbers are positive");
        }
    }
    // Реверс массива
    public void reverse() {
        int d;
        for (int i = 0; i < c / 2; i++) {
            d = array[i];
            array[i] = array[c-i-1];
            array[c-i-1] = d;
        }
        System.out.println("Reversed");
    }
}
