package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {
        int [] scores = {20, 27, 23, 31, 15, 18, 17, 11, 12, 13};
        int sum = 0;
        for (int i : scores) sum += i;
        double average = (double) sum/ scores.length;
        Arrays.sort(scores);
        int high = scores[scores.length - 1];
        int low = scores [0];

        System.out.println("Average: " + average);
        System.out.println("low: " + low);
        System.out.println("High: + " + high);








    }
}
