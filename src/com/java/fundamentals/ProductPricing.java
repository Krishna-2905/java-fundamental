package com.java.fundamentals;

import java.util.Scanner;

public class ProductPricing {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int productPrice;
        float discountPrice, quantity, quantityprice,totalsaved ;
        float priceAfterDiscount, centralTax = 2.5F, stateTax = 2.5F, tax, finalPrice;
        System.out.println("Enter the product price");
        productPrice = sc.nextInt();
        System.out.println("Enter the discount percentage");
        discountPrice = sc.nextFloat();
        discountPrice = (productPrice * discountPrice) / 100;
        priceAfterDiscount = productPrice - discountPrice;
        System.out.println("The discountPrice is: " + priceAfterDiscount);
        tax = (centralTax +stateTax);
        System.out.println("The tax is: " + tax);
        finalPrice = tax + priceAfterDiscount;
        System.out.println("The finalPrice is: " + finalPrice);
        System.out.println("enter required qunaity: ");
        quantity = sc.nextFloat();
        quantityprice = (quantity * finalPrice) ;
        System.out.println("The quantityprice is: " + quantityprice);
        totalsaved = productPrice-discountPrice*quantity;
        System.out.println("The totalsaved is: " + totalsaved);
        sc.close();
}
}
