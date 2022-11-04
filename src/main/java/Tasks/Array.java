package Tasks;

import java.util.Scanner;

public class Array {
    private int[] array;
    public Array(int size)
    {
        if(size <= 0)
        {
            throw new IllegalArgumentException("wrong size");
        }
        array = new int[size];
    }
    public void outputArray() { // Вывод массива на экран
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    // Считывание чисел с клавиатуры (первое число - кол-во чисел, которое планируется ввести)
    public void inputArray() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }
    // Сумма чисел массива
    public void sumArray() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum: " + sum);
    }
    // Сколько чётных чисел
    public void evenNumbers() {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                count += 1;
        }
        System.out.println("Even: " + count);
    }
    // Числа принадлежащие отрезку
    public void segment(int a, int b) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= a && array[i] <= b)
                count += 1;
        }
        System.out.println("Segment: " + count);
    }
    // Все ли числа положительные
    public void positive() {
        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
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
        for (int i = 0; i < array.length / 2; i++) {
            d = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = d;
        }
        System.out.println("Reversed");
    }
}
