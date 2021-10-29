package ru.tn.courses.nzarudniy.v5.task_1;

import java.util.List;

/** 
 * Каждый солнечный день улитка, сидящая на дереве, поднимается вверх на 2 см,
 * а каждый пасмурный день опускается вниз на 1 см, В начале наблюдения улитка находится в A см от земли
 * на B-метровом дереве. Имеется 30-элементный массив, содержащий сведения о том,
 * был ли соответствующий день наблюдения пасмурным или солнечным. Написать программу,
 * определяющую местоположение улитки к концу 30-го дня наблюдения.
 * 
 * @author https://github.com/taubedonner
 */
public class Subtask2 {
    /** Number of observation days */
    private static final Integer N = 30;

    /** Initial snail height above the ground (cm) */
    private static final Integer A = 7;

    /** Tree height (cm) */
    private static final Integer B = 2 * 100;

    public static void main(String[] args) {
        Integer snailPos = A;
        List<Boolean> weather = TaskUtils1.genSnailDirections(N);

        System.out.println("Snail crawling...");

        for (Integer i = 0; i < weather.size(); ++i) {
            if (weather.get(i) && snailPos > 0) {
                snailPos--;
            } else if (snailPos < (B - 1)) {
                snailPos += 2;
            } else if (snailPos == (B - 1)) {
                snailPos++;
            }

            System.out.printf("  d%d:\t%s\t(%d/%dcm)%n", i + 1, weather.get(i) ? "Down" : "Up", snailPos, B);
        }

        System.out.printf("Total:\t%dcm\t(%d/%dcm)%n", snailPos - A, snailPos, B);
    }
}
