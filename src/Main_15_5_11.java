/*Решите задачу при помощи стримов:
Сгенерируйте последовательность чисел от 1 до 100 включительно,
ограничьте ее последними 50 числами, оставьте только те числа,
которые делятся без остатка на 2 или на 5, и посчитайте
сумму полученных чисел. В ответе у вас должно выйти 2275.*/

import java.util.stream.IntStream;

public class Main_15_5_11 {
    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1, 100);
        int sum = stream
                .skip(50) // оставляем последние 50 элементов
                .filter(integer -> integer % 2 == 0 || integer % 5 == 0)// фильтруем
                .sum();//суммируем
        System.out.println(sum);
    }
}
