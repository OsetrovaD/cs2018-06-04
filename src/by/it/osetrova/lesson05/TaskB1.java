package by.it.osetrova.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("В лесу родилась ёлочка,");
        list.add("В лесу она росла.");
        list.add("Зимой и летом стройная,");
        list.add("Зелёная была.");
        list.add("Метель ей пела песенку:");
        System.out.println(list.size());
        for (String x: list)
            System.out.println(x);
    }
}
