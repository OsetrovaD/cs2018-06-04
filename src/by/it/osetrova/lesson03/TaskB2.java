package by.it.osetrova.lesson03;

import java.util.Scanner;

/*
Lesson 03. Task B2. Нужно написать программу, которая вводит три числа  a b c типа int с клавиатуры
и вычисляет корни квадратного уравнения a*a*x + b*x + c = 0:
1) Если два корня, то выводится два корня через пробел.
2) Если один корень, то выводится только одно число - корень.
3) Если нет действительных корней, то выводится сообщение об ошибке "Отрицательный дискриминант"

В программе должен быть определен статический метод dis вычисления дискриминанта,
который принимает на входе три числа типа int a,b,c
а на выходе возвращает число типа double

Примеры работы

Ввод:
2 5 3
Вывод:
-1.0 -1.5

Ввод:
2 4 2
Вывод:
-1.0

Ввод:
2 2 2
Вывод:
Отрицательный дискриминант

*/
class TaskB2 {
    public static double dis(int a, int b, int c){
        double result = b*b-4*a*c;
        return result;
    }
    public static void main(String[] args) {
        Scanner n1=new Scanner(System.in);
        int i = n1.nextInt();
        int j = n1.nextInt();
        int k = n1.nextInt();
        double dis = dis(i, j, k);
        if (dis>0){
            double x1;
            double x2;
            x1 = (-j+Math.sqrt(dis))/(2*i);
            x2 = (-j-Math.sqrt(dis))/(2*i);
            System.out.println(x1+" "+x2);
        }
        else if (dis==0){
            double x1;
            x1 = (-j)/(2.0*i);
            System.out.println(x1);
        }
        else if (dis<0){
            System.out.println("Отрицательный дискриминант");
        }
    }
}
