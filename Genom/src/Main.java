/*
10.Поиск геномных последовательностей.
Задать массив целых чисел длиной 10 элементов.
Заполнить его числами.
Затем реализовать сортировку этой последовательности от меньшего к
большему.
Результат вывести в консоль компьютера.
Нельзя использовать метод Arrays.sort и подобные ему."

 */

import java.util.Random;

public class Main {
    void main() {
        int[] array = new int[10];
        Random random = new Random();
        //заполнение массива случайными числами
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }
        //сортировка массива от меньшего к большему
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int x;
                if (array[i] > array[j]) {
                    x = array[j];
                    array[j] = array[i];
                    array[i] = x;
                }
            }

        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("i_" + i + "=" + array[i]);

        }

    }
}
