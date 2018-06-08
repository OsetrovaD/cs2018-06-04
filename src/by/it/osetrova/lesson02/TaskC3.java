package by.it.osetrova.lesson02;

import java.util.Scanner;

/*
Ускорение свободного падения на Земле и Марсе таково:
Марс   3.86
Земля   9.81

С клавиатуры вводится вес человека в килограммах.
Рассчитайте вес человека на Марсе и выведите
округлив его до сотых килограмма (2 знака)

Создайте для этих целей метод getWeight(int weight)

Требования:
1. Метод getWeight(int weight) должен быть статическим.
2. Метод getWeight должен возвращать значение типа double.
3. Метод getWeight должен обязательно (!) округлять до сотых возвращаемое значение типа double.
4. Метод getWeight не должен ничего выводить на экран.
5. Метод getWeight должен правильно переводить вес тела в килограммах на Земле
    в вес этого же тела на Марсе, и возвращать это значение.

Пример:

Ввод:
75

Вывод:
29.51


*/
class TaskC3 {
    public static int setWeight(){
        Scanner n1=new Scanner(System.in);
        int i = n1.nextInt();
        return i;
    }
    public static double getWeight(int weight){
        double result = Math.rint(weight/9.81*3.86*100)/100;
        return result;
    }
    public static void main(String[] args) {
        int sW;
        sW = setWeight();
        System.out.println(getWeight(sW));
    }
}
/*class TaskC3 {
    public static void main(String[] args) {
        System.out.println(getWeight());
    }
    public static double getWeight(){
        Scanner n1=new Scanner(System.in);
        int i = n1.nextInt();
        double result = Math.rint(i/9.81*3.86*100)/100;
        return result;
    }
}
*/
/*class Weight {
    public static void getWeight(){
        Scanner n1=new Scanner(System.in);
        int i = n1.nextInt();
        double result = Math.rint(i/9.81*3.86*100)/100;
        System.out.println(result);
    }
}
class TaskC3 {
    public static void main(String[] args) {
        Weight w1 = new Weight();
        w1.getWeight();
    }
}
*/