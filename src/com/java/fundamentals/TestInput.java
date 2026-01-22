package com.java.fundamentals;

import java.util.Scanner;

public class TestInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte rating, classStrength, age, charging, wings;

        System.out.print("Enter rating: ");
        rating = sc.nextByte();

        System.out.print("Enter classStrength: ");
        classStrength = sc.nextByte();

        System.out.print("Enter age: ");
        age = sc.nextByte();

        System.out.print("Enter charging: ");
        charging = sc.nextByte();

        System.out.print("Enter wings: ");
        wings = sc.nextByte();

        System.out.println("rating = " + rating);
        System.out.println("classStrength = " + classStrength);
        System.out.println("age = " + age);
        System.out.println("charging = " + charging);
        System.out.println("wings = " + wings);

        System.out.println();

        short year, population, boilingPoint, birthYear;

        System.out.print("Enter year: ");
        year = sc.nextShort();

        System.out.print("Enter population: ");
        population = sc.nextShort();

        System.out.print("Enter boilingPoint: ");
        boilingPoint = sc.nextShort();

        System.out.print("Enter birthYear: ");
        birthYear = sc.nextShort();

        System.out.println("year = " + year);
        System.out.println("population = " + population);
        System.out.println("boilingPoint = " + boilingPoint);
        System.out.println("birthYear = " + birthYear);

        System.out.println();

        int dailyMetroPassengers, appDownloads, votesCount, cityPopulation;

        System.out.print("Enter dailyMetroPassengers: ");
        dailyMetroPassengers = sc.nextInt();

        System.out.print("Enter appDownloads: ");
        appDownloads = sc.nextInt();

        System.out.print("Enter votesCount: ");
        votesCount = sc.nextInt();

        System.out.print("Enter cityPopulation: ");
        cityPopulation = sc.nextInt();

        System.out.println("dailyMetroPassengers = " + dailyMetroPassengers);
        System.out.println("appDownloads = " + appDownloads);
        System.out.println("votesCount = " + votesCount);
        System.out.println("cityPopulation = " + cityPopulation);

        System.out.println();

        long aadhaarNumber, mobileNumber, bankAccountNumber, electricityBillNumber;

        System.out.print("Enter aadhaarNumber: ");
        aadhaarNumber = sc.nextLong();

        System.out.print("Enter mobileNumber: ");
        mobileNumber = sc.nextLong();

        System.out.print("Enter bankAccountNumber: ");
        bankAccountNumber = sc.nextLong();

        System.out.print("Enter electricityBillNumber: ");
        electricityBillNumber = sc.nextLong();

        System.out.println("aadhaarNumber = " + aadhaarNumber);
        System.out.println("mobileNumber = " + mobileNumber);
        System.out.println("bankAccountNumber = " + bankAccountNumber);
        System.out.println("electricityBillNumber = " + electricityBillNumber);

        sc.close();
    }
}