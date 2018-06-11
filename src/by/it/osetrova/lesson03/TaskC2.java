package by.it.osetrova.lesson03;

import java.util.Scanner;

/*
    Сумма цифр четырехзначного числа

    Реализуйте метод sumDigitsInNumber(int number).
    Метод на вход принимает целое четырехзначное число.
    Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

    Пример:
    Метод sumDigitsInNumber вызывается с параметром 5467.

    Пример вывода:
    22

    Требования:
    1. В методе sumDigitsInNumber не могут быть использованы никакие дополнительные классы.
    2. Метод sumDigitsInNumber(int) должен быть не приватным и статическим.
    3. Метод sumDigitsInNumber должен возвращать значение типа int.
    4. Метод sumDigitsInNumber не должен ничего выводить на экран.
    5. Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
*/
public class TaskC2 {
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
        int i = n1.nextInt();
        int sum = sumDigitsInNumber(i);
        if (i >= 1000 && i <= 9999) {
            System.out.println(sum);
        }
    }
    static int sumDigitsInNumber(int number) {
        int a = number / 1000;
        int b = number / 100 - a * 10;
        int c = number / 10 - a * 100 - b * 10;
        int d = number - a * 1000 - b * 100 - c * 10;
        int sum = a + b + c + d;
        return sum;
    }
}



//    public static void main(String[] args) {
//        System.out.println(sumDigitsInNumber(5467));
//    }


