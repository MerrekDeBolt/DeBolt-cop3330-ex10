/*
 *  UCF COP3330 Fall 2021 Exercise 10 Solution
 *  Copyright 2021 Merrek DeBolt
 */

import java.util.Scanner;

public class Main {

    public static double TaxRate = 0.055;

    public static void main(String[] args)
    {
        String priceStr,quantityStr;
        double price1, price2, price3, subtotal, tax, total;
        int quantity1, quantity2, quantity3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the price of item 1: ");
        priceStr = scanner.nextLine();
        price1 = Double.parseDouble(priceStr);
        System.out.println("Enter the quantity of item 1: ");
        quantityStr = scanner.nextLine();
        quantity1 = Integer.parseInt(quantityStr);

        System.out.println("Enter the price of item 2: ");
        priceStr = scanner.nextLine();
        price2 = Double.parseDouble(priceStr);
        System.out.println("Enter the quantity of item 2: ");
        quantityStr = scanner.nextLine();
        quantity2 = Integer.parseInt(quantityStr);

        System.out.println("Enter the price of item 3: ");
        priceStr = scanner.nextLine();
        price3 = Double.parseDouble(priceStr);
        System.out.println("Enter the quantity of item 3: ");
        quantityStr = scanner.nextLine();
        quantity3 = Integer.parseInt(quantityStr);

        price1 *= quantity1;
        price2 *= quantity2;
        price3 *= quantity3;

        subtotal = price1 + price2 + price3;
        tax = subtotal * TaxRate;

        total = subtotal + tax;

        System.out.println("Subtotal: $" + String.format("%,.2f", subtotal));
        System.out.println("Tax: $" + String.format("%,.2f", tax));
        System.out.println("Total: $" + String.format("%,.2f", total));
    }
}