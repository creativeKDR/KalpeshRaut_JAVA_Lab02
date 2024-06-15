package com.greatlearning.javafsd.model;

import java.util.Arrays;
import java.util.Scanner;

public class CurrencyPayment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of currency denominations");
        int size = scanner.nextInt();

        int[] denominations = new int[size];
        System.out.println("Enter the currency denominations value");
        for (int i = 0; i < size; i++) {
            denominations[i] = scanner.nextInt();
        }

        System.out.println("Enter the amount you want to pay");
        int amount = scanner.nextInt();

        Arrays.sort(denominations);
        for (int i = 0; i < size / 2; i++) {
            int temp = denominations[i];
            denominations[i] = denominations[size - i - 1];
            denominations[size - i - 1] = temp;
        }

        System.out.println("Your payment approach in order to give min no of notes will be");
        for (int i = 0; i < size; i++) {
            if (amount >= denominations[i]) {
                int count = amount / denominations[i];
                amount -= count * denominations[i];
                System.out.println(denominations[i] + ":" + count);
            }
        }

        scanner.close();
    }
}

