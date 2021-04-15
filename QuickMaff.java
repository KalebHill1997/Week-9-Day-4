package com.tts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickMaff {
    public static void Sumandstuff(int num1, int num2, int num3, int num4, int num5) {
        List<Integer> numList = new ArrayList<>();

        numList = Arrays.asList(num1, num2, num3, num4, num5);

        int sum = 0, product = 1, largest = num1, smallest = num1;

        for (int i = 0; i <= numList.size() - 1; i++) {
            System.out.println("The current sum is now: ");
            sum += numList.get(i);
            System.out.println(sum);
            System.out.println("The current product is now: ");
            product *= numList.get(i);
            System.out.println(product);
            System.out.println("The current largest is now: ");
            if (largest < numList.get(i)) {
                largest = numList.get(i);
            }
            System.out.println(largest);
            System.out.println("The current smallest is now: ");
            if (smallest > numList.get(i)) {
                smallest = numList.get(i);
            }
            System.out.println(smallest);
            System.out.println("_____________________");
        }
    }
}
