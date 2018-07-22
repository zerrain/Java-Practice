package com.company;

public class isPrime {
    public static void main(String[] args) {
        int numbers[] = {12,15,3,6,11,13,17,27,23,37, 40, 9};
        boolean checkPrime;

        for (int i = 0; i < numbers.length; i++) {
            checkPrime = true;
            for (int j = 2; j < numbers[i]/2; j++) {
                if (numbers[i]%j == 0) {
                    checkPrime = false;
                    break;
                }
            }
            if (checkPrime)
                System.out.println(numbers[i] + " is a prime number");
        }
    }
}
