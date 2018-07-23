package com.company;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        String test1 = "HelloWorld";
        String test2 = "HelloolleH";
        String check = "";

        for (int i = test1.length() - 1; i >= 0; i--)
            check += test1.charAt(i);
        if (check.equals(test1))
            System.out.println(test1 + " is a palindrome.");
        else
            System.out.println(test1 + " is not a palindrome.");

        check = "";

        for (int i = test2.length() - 1; i >= 0; i--)
            check += test2.charAt(i);
        if (check.equals(test2))
            System.out.println(test2 + " is a palindrome.");
        else
            System.out.println(test2 + " is not a palindrome");
    }
}
