package by.it.osetrova.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
Sum = 26
*/
class TaskC1 {
    public static void main(String[] args) {
        Scanner n1=new Scanner(System.in);
        int i = n1.nextInt();
        int a = n1.nextInt();
        int b = i+a;
        System.out.println("Sum" + " " + "=" + " " + b);
    }





}
