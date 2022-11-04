package Tasks;

import Tasks.Array;

public class Task8 {
    public static void main(String[] args) {
        // Вызовы функций, описанных в классе Tasks.Array
        Array myObj = new Array(4);
        myObj.inputArray();
        myObj.outputArray();
        myObj.sumArray();
        myObj.evenNumbers();
        myObj.segment(3, 5);
        myObj.positive();
        myObj.reverse();
        myObj.outputArray();
    }
}
// 3 4 6 3