package Tasks;

import java.util.Scanner;

public class BasicsProgramm
{
    public static double[] task4(double a, double b, double c)
    {
        double d, x1, x2;
        if(a == 0)
        {
            x1 = -c/b;
            double[] roots = new double[1];
            roots[0] = x1;
            return roots;
        }
        else {
            d = b * b - 4 * a * c; // Дискриминант
            if (Double.compare(d,0) < 0) {
                double[] roots = new double[0];
                return roots;
            } else if (Double.compare(d,0) == 0) {
                x1 = -b / (2 * a);
                double[] roots = new double[1];
                roots[0] = x1;
                return roots;
            } else {
                x1 = (-b + Math.sqrt(d)) / (2 * a);
                x2 = (-b - Math.sqrt(d)) / (2 * a);
                double[] roots = new double[2];
                roots[0] = x1;
                roots[1] = x2;
                return roots;
            }
        }
    }
    public static void task5(double start, double end, double step)
    {
        {
            for (double i = start; i < end; i = i + step){
                System.out.println("sin(" + i + ") = " + Math.sin(i));
            }
        }
    }
    public static void task6(double a1, double b1, double c1, double a2, double b2, double c2)
    {
        double a, b, c, d, e, f, x, y;
        a = a1;
        b = b1;
        c = c1;
        d = a2;
        e = b2;
        f = c2;
        y = (f -(d * c / a1)) / (e - (b * d / a)); // Выводится из двух систем линейных уравнений
        x = (c - b * y) / a;
        System.out.println("x:" + x);
        System.out.println("y:" + y);
    }
    public static double task7(double x, double eps)
    {
            int i = 1;
            double t, sum, fact, add;
            fact = 1; // Факториал
            add = eps + 1;
            sum = 1;
            while (eps < add) { // Пока точность меньше слагаемого
                fact *= i;
                add = Math.pow(x, i) / fact;
                sum += add;
                i++;
            }
            return sum;
        }
    }


