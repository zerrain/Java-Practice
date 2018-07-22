package com.company;

public class Bubblesort {
    public static void main(String[] args) {
        int numbers[] = {24, 12, 78, 63, 25, 99, 41, 42, 26, 21, 10, 112};
        int temp;

        for (int j = 0; j < numbers.length - 1; j++) {
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    temp = numbers[i + 1];
                    numbers[i + 1] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }

        for (int num : numbers)
            System.out.println(num);
    }
}
