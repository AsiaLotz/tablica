package com.company;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static int[] sortNumbers(int[] numbers) {

        int length = numbers.length;

        for (int i = 0; i < length - 1; i++) {

            if (numbers[i] < numbers[i + 1]) {


                int temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;

                i = -1;
            }
        }

        return numbers;
    }


    private static boolean search(int[] numbers, int x) {
        for (int i : numbers) {
            if (i == x) {
                System.out.printf("Found number " + x + "so it's true!");
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbers = {7, 8, 10, 34, 28, 65, 99, 4};

        numbers = sortNumbers(numbers);

        System.out.println("Sorted array: "
                + Arrays.toString(numbers));

        search(numbers, 4);
    }

}



