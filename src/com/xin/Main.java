package com.xin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //stores the incrementing number
        int incrementingNumber = 1;

        //Enter the string value to validate if it is palindrome or not.
        System.out.print("Enter string: ");
        Scanner sc = new Scanner(System.in);
        String x = sc.next(); //stores string
        String reverse = "";
        for (int i = x.length() - 1; i >= 0; i--){ 
            reverse = reverse + x.charAt(i); // to take the user inputs
        }

        if (x.equals(reverse)){ // the main method 
            System.out.println(x + " is Palindrome"); // if it is a palindrome 
        } else {
            System.out.println(x + " is not Palindrome"); //if it is not a palindrome
        }

        System.out.print("Enter a number: ");
        int test = sc.nextInt();


        for (int i = 1; i <= test; i++){
            for (int j = 1; j <= i; j++) { // nested loop 
                System.out.print(incrementingNumber + " ");
                incrementingNumber++;
            }
            System.out.println();
        }
    }
}
