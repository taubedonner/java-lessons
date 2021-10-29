package ru.tn.courses.nzarudniy.v5.task_1;

import java.util.Collections;
import java.util.List;

/**
 * Сортировка Шелла. Дан массив n действительных чисел.
 * Требуется упорядочить его по возрастанию.
 * Делается это следующим образом: сравниваются два соседних элемента ai и аi+1.
 * Если ai ≤ ai+1, то продвигаются на один элемент вперед.
 * Если ai > ai+1, то производится перестановка и сдвигаются на один элемент назад.
 * Составить алгоритм этой сортировки.
 * 
 * @author https://github.com/taubedonner
 */
public class Subtask3 {
    public static void main(String[] args) {
        List<Double> a = TaskUtils1.genRealNumbers(10, 100);
        
        System.out.println("Initial List:");
        a.forEach((v) -> System.out.println(v));

        Integer i = 0;
        while (i < a.size() - 1) {
            if (a.get(i) <= a.get(i + 1)) {
                ++i;
            } else {
                Collections.swap(a, i, i + 1);
                if (i > 0) {
                    --i;
                }
            }
        }

        System.out.println("\nSorted List:");
        a.forEach((v) -> System.out.println(v));
    }
}
