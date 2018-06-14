package by.it.osetrova.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.lang.reflect.Array;
import java.util.*;

/*public class TaskC2 {
    public static void main(String[] args) {
        int [] getNumbers = new int[20];
        Scanner n1 = new Scanner(System.in);
        for (int i = 0; i < getNumbers.length; i++){
            getNumbers [i] = n1.nextInt();
        }
        sort(getNumbers);
    }
    public static void sort(int[] array) {
        ArrayList<Integer> newSort = new ArrayList<>();
        for (int i = 0; i < array.length; i++){
            newSort.add(array[i]);
        }
        Collections.sort(newSort);
        Collections.reverse(newSort);
        System.out.println(newSort);
    }
}*/
public class TaskC2 {
    public static void main(String[] args) {
        int [] getNumbers = new int[20];
        Scanner n1 = new Scanner(System.in);
        for (int i = 0; i < getNumbers.length; i++){
            getNumbers [i] = n1.nextInt();
        }
        sort(getNumbers);
    }
    public static void sort(int[] array) {
        Arrays.sort(array);
        for (int i = array.length - 1; i >= 0; i--)
            System.out.print(array[i] + "\n");
    }
}
