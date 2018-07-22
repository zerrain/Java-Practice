package com.company;

public class FibonacciIterative {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int n3;

        for (int i = 0; i < 15; i++) {
            if (i < 2)
                System.out.println(i);
            else {
                n3 = n1 + n2;
                System.out.println(n3);
                n1 = n2;
                n2 = n3;
            }
        }
    }
}
