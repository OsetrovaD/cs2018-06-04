package by.it.osetrova.lesson04;

import java.util.Scanner;

/*

На входе вводится число и месяц 2018 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

 */
public class TaskC2 {
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
        int day = n1.nextInt();
        int month = n1.nextInt();
        int daysOfJanuary = 1;
        int daysOfFebruary = 32;
        int daysOfMarch = 60;
        int daysOfApril = 91;
        int daysOfMay = 121;
        int daysOfJune = 152;
        int daysOfJuly = 182;
        int daysOfAugust = 213;
        int daysOfSeptember = 244;
        int daysOfOctober = 274;
        int daysOfNovember = 305;
        int daysOfDecember = 335;
        int d = 0;
        if (month >= 1 && month <= 12){
            switch (month) {
                case 1:
                    d = day + daysOfJanuary - 1;
                    break;
                case 2:
                    d = day + daysOfFebruary - 1;
                    break;
                case 3:
                    d = day + daysOfMarch - 1;
                    break;
                case 4:
                    d = day + daysOfApril - 1;
                    break;
                case 5:
                    d = day + daysOfMay - 1;
                    break;
                case 6:
                    d = day + daysOfJune - 1;
                    break;
                case 7:
                    d = day + daysOfJuly - 1;
                    break;
                case 8:
                    d = day + daysOfAugust - 1;
                    break;
                case 9:
                    d = day + daysOfSeptember - 1;
                    break;
                case 10:
                    d = day + daysOfOctober - 1;
                    break;
                case 11:
                    d = day + daysOfNovember - 1;
                    break;
                case 12:
                    d = day + daysOfDecember - 1;
                    break;
            }
        }
        System.out.println(d);
    }

}
/*if (month >= 1 && month <= 12)
            if (month == 1){
            int d = day + daysOfJanuary - 1;
                System.out.println(d);
            }
            else if (month == 2){
                int d = day + daysOfFebruary - 1;
                System.out.println(d);
            }
            else if (month == 3){
                int d = day + daysOfMarch - 1;
                System.out.println(d);
            }
            else if (month == 4){
                int d = day + daysOfApril - 1;
                System.out.println(d);
            }
            else if (month == 5){
                int d = day + daysOfMay - 1;
                System.out.println(d);
            }
            else if (month == 6){
                int d = day + daysOfJune - 1;
                System.out.println(d);
            }
            else if (month == 7){
                int d = day + daysOfJuly - 1;
                System.out.println(d);
            }
            else if (month == 8){
                int d = day + daysOfAugust - 1;
                System.out.println(d);
            }
            else if (month == 9){
                int d = day + daysOfSeptember - 1;
                System.out.println(d);
            }
            else if (month == 10){
                int d = day + daysOfOctober - 1;
                System.out.println(d);
            }
            else if (month == 11){
                int d = day + daysOfNovember - 1;
                System.out.println(d);
            }
            else if (month == 12){
                int d = day + daysOfDecember - 1;
                System.out.println(d);
            }*/