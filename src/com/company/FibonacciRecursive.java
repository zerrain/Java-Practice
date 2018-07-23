package com.company;

import java.util.Scanner;

public class FibonacciRecursive {

    public static void main(String[] args) {
        System.out.println(recursiveFib(20));
    }

    public static int recursiveFib (int number) {
        if (number <= 1)
            return number;
        else {
            return recursiveFib(number - 1) + recursiveFib(number - 2);
        }
    }
}
