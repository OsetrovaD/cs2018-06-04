package by.it.osetrova.lesson05;
/*
Три массива
1.  Введите с клавиатуры 20 чисел, сохраните их в список и рассортируйте по трём другим спискам:
    Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2.  Статический метод void printList(List<Integer> list) должен выводить на экран
    все элементы переданного ему списка list, каждый элемент - с новой строки.
3.  Используя метод printList выведите ваши три списка на экран.
    Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) throws IOException
    {
        int [] getNumbers = new int[20];
        Scanner n1 = new Scanner(System.in);
        for (int i = 0; i < getNumbers.length; i++){
            getNumbers [i] = n1.nextInt();
        }
        ArrayList<Integer> firstList = new ArrayList<>();
        ArrayList<Integer> listForTwo = new ArrayList<>();
        ArrayList<Integer> listForThree = new ArrayList<>();
        ArrayList<Integer> listForRemaining = new ArrayList<>();
        for (int i = 0; i < getNumbers.length; i++){
            firstList.add(getNumbers[i]);
        }
        for (int i = 0; i < firstList.size(); i++){
            Integer x = firstList.get(i);
            if (x % 3 == 0 && x % 2 == 0) {
                listForThree.add(x);
                listForTwo.add(x);
            }
            else if (x % 2 != 0 && x % 3 == 0)
                listForThree.add(x);
            else if (x % 2 == 0 && x % 3 != 0)
                listForTwo.add(x);
            else
                listForRemaining.add(x);
        }
        printList(listForThree);
        printList(listForTwo);
        printList(listForRemaining);

    }

    private static void printList(List<Integer> list) {
        for (Integer aList : list) System.out.println(aList);
    }


}

//1 3 6 8 15 25 7 14 54 27 13 9 32 77 88 16 31 45 81 64