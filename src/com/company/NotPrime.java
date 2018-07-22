package com.company;

public class NotPrime {
    public static void main(String[] args) {
        for (int i = 1; i < 25; i++)
            for (int j = 1; j < i; j++) {
                if ((i % j) == 0) {
                    System.out.println(i + " is not a prime number");
                    i++;
                }
            }
    }
}
