package ru.tn.courses.nzarudniy.v5.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Necessary but not directly related to any Task1 stuff.
 * 
 * @author https://github.com/taubedonner
 */
public class TaskUtils1 {
    /** Generates a list of random positive integers. */
    public static List<Integer> genNaturalNumbers(Integer count, Integer maxValue) {
        List<Integer> numList = new ArrayList<Integer>();
        while (count-- > 0) {
            int t = ThreadLocalRandom.current().nextInt();
            numList.add((t > 0 ? t : -t) % (maxValue + 1));
        }
        return numList;
    }

    /** Generates a random weather conditions (snail directions) list. False - Sunny; True - Cloudy */
    public static List<Boolean> genSnailDirections(Integer numOfDays) {
        List<Boolean> condList = new ArrayList<Boolean>();
        while (numOfDays-- > 0) {
            condList.add(ThreadLocalRandom.current().nextBoolean());
        }
        return condList;
    }

    /** Generates a list of random real numbers. */
    public static List<Double> genRealNumbers(Integer count, Integer maxValue) {
        List<Double> numList = new ArrayList<Double>();
        while (count-- > 0) {
            numList.add((ThreadLocalRandom.current().nextDouble() * maxValue * 2) - maxValue);
        }
        return numList;
    }
}
