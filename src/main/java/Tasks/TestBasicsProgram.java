package Tasks;

import Tasks.BasicsProgramm;

public class TestBasicsProgram
{
    public static void main(String[] args)
    {
        double[] arr1 = BasicsProgramm.task4(1,5,6);
        System.out.println(arr1[0]+" "+" "+arr1[1]);
        double[] arr2 = BasicsProgramm.task4(0,5,10);
        System.out.println(arr2[0]);
        double[] arr3 = BasicsProgramm.task4(1,1,2);
        System.out.println(arr3.length);
        System.out.println("__________________________________");
        BasicsProgramm.task5(0, 5, 0.5);
        System.out.println("__________________________________");
        BasicsProgramm.task6(1, 1 , 2 , 1, 3, 4);
        System.out.println("__________________________________");
        System.out.println(BasicsProgramm.task7(1, 0.000001));
    }
}
