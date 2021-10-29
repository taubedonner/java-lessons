package ru.tn.courses.nzarudniy.v5.task_1;

import java.util.List;

/**
 * Дана последовательность натуральных чисел a1, a2, ..., an.
 * Создать массив из четных чисел этой последовательности.
 * Если таких чисел нет, то вывести сообщение об этом факте.
 * 
 * @author https://github.com/taubedonner
 */
public class Subtask1 {
    /** Number of elements in sequence */
    private static final Integer n = 3;

    public static void main(String[] args) {
        List<Integer> seq = TaskUtils1.genNaturalNumbers(n, 100);
        System.out.printf("Initial Sequence: %s;%n", seq);

        seq.removeIf((i) -> (i & 1) == 1);
        System.out.printf("Even Sequence: %s.%n", (seq.size() > 0) ? seq : "Empty");
    }
}
