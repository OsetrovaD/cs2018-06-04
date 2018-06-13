package by.it.osetrova.lesson04;

/*
Вывести таблицу умножения 10 x 10 (двоныйм циклом),
но вывод должен быть словами:

Ожидаемый вывод:
два умножить на два равно четыре
два умножить на три равно шесть
два умножить на четыре равно восемь
два умножить на пять равно десять
два умножить на шесть равно двенадцать
два умножить на семь равно четырнадцать
два умножить на восемь равно шестнадцать
два умножить на девять равно восемнадцать
два умножить на десять равно двадцать
три умножить на два равно шесть
три умножить на три равно девять
три умножить на четыре равно двенадцать
...
и т.д. до фразы
...
десять умножить на десять равно сто
*/

import java.util.Locale;

public class TaskC3 {
    static String getUnit(int x) {
        switch (x) {
            case 1:
                return "один";
            case 2:
                return "два";
            case 3:
                return "три";
            case 4:
                return "четыре";
            case 5:
                return "пять";
            case 6:
                return "шесть";
            case 7:
                return "семь";
            case 8:
                return "восемь";
            case 9:
                return "девять";
            case 10:
                return "десять";
        }
        return null;
    }
    static String getTens(int y) {
        switch (y) {
            case 11:
                return "одиннадцать";
            case 12:
                return "двенадцать";
            case 13:
                return "тринадцать";
            case 14:
                return "четырнадцать";
            case 15:
                return "пятнадцать";
            case 16:
                return "шестнадцать";
            case 17:
                return "семнадцать";
            case 18:
                return "восемнадцать";
            case 19:
                return "девятнадцать";
            case 20:
                return "двадцать";
            case 30:
                return "тридцать";
            case 40:
                return "сорок";
            case 50:
                return "пятьдесят";
            case 60:
                return "шестьдесят";
            case 70:
                return "семьдесят";
            case 80:
                return "восемьдесят";
            case 90:
                return "девяносто";
        }
        return null;
    }
    static String getHundreds(int z) {
        switch (z) {
            case 100:
                return "сто";
        }
        return null;
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int k = 1; k <= 10; k++) {
                int mult = k * i;
                if (mult <= 10)
                    System.out.println(getUnit(i) + " умножить на " + getUnit(k) + " равно " + getUnit(mult));
                else if (mult > 10 && mult <= 19) {
                    System.out.println(getUnit(i) + " умножить на " + getUnit(k) + " равно " + getTens(mult));
                }
                else if (mult >= 20 && mult <= 99) {
                    int a = (mult / 10) * 10;
                    int b = mult - a;
                    if (b != 0)
                        System.out.println(getUnit(i) + " умножить на " + getUnit(k) + " равно " + getTens(a) + " " + getUnit(b));
                    else
                        System.out.println(getUnit(i) + " умножить на " + getUnit(k) + " равно " + getTens(a));
                }
                else if (mult == 100)
                    System.out.println(getUnit(i) + " умножить на " + getUnit(k) + " равно " + getHundreds(mult));
            }
        }

    }
}
