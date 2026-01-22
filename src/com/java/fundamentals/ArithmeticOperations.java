package com.java.fundamentals;

import java.util.Scanner;

public class ArithmeticOperations {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            byte  no1, no2;
            System.out.println("Enter 1st number");
            no1 = sc.nextByte();
            System.out.println("Enter 2nd number");
            no2 = sc.nextByte();
            short result ;
            result = (short) (no1 + no2);
            System.out.println("The result is: " + result);;
            sc.close();
        }
    }

