package com.company;

import java.util.Scanner;

public class DecimaltoRoman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimalValue = sc.nextInt();
        String romanValue = "";

        while (decimalValue >= 1000) {
            decimalValue -= 1000;
            romanValue += "M";
        }
        while (decimalValue >= 900) {
            decimalValue -= 900;
            romanValue += "CM";
        }
        while (decimalValue >= 500) {
            decimalValue -= 500;
            romanValue += "D";
        }
        while (decimalValue >= 400) {
            decimalValue -= 400;
            romanValue += "CD";
        }
        while (decimalValue >= 100) {
            decimalValue -= 100;
            romanValue += "C";
        }

        System.out.println(romanValue);
    }
}
