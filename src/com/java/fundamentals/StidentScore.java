package com.java.fundamentals;

import java.util.Scanner;

public class StidentScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte subject1Score, subject2score, subject3Score, subject4Score, subject5Score, subject6Core;
        System.out.println("Enter subject1Score: ");
        subject1Score = sc.nextByte();
        System.out.println("Enter subject2score");
        subject2score = sc.nextByte();
        System.out.println("Enter subject3Score");
        subject3Score = sc.nextByte();
        System.out.println("Enter subject4Score");
        subject4Score = sc.nextByte();
        System.out.println("Enter subject5Score");
        subject5Score = sc.nextByte();
        System.out.println("Enter subject6Core");
        subject6Core = sc.nextByte();
        short result;
        result = (short) (subject1Score + subject2score + subject3Score + subject4Score + subject5Score + subject6Core);
        System.out.println("The result is: " + result);
        float average = (float) result/ 6;
        System.out.println("The average is: " + average);
        sc.close();


    }
}