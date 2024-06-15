package com.greatlearning.javafsd.model;

import java.util.Scanner;

public class PayMoney {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of transaction array");
        int size = scanner.nextInt();

        int[] transactions = new int[size];
        System.out.println("Enter the values of array");
        for (int i = 0; i < size; i++) {
            transactions[i] = scanner.nextInt();
        }

        System.out.println("Enter the total no of targets that needs to be achieved");
        int numberOfTargets = scanner.nextInt();

        for (int i = 0; i < numberOfTargets; i++) {
            System.out.println("Enter the value of target");
            int target = scanner.nextInt();

            int sum = 0;
            boolean targetAchieved = false;

            for (int j = 0; j < size; j++) {
                sum += transactions[j];
                if (sum >= target) {
                    System.out.println("Target achieved after " + (j + 1) + " transactions");
                    targetAchieved = true;
                    break;
                }
            }

            if (!targetAchieved) {
                System.out.println("Given target is not achieved");
            }
        }

        scanner.close();
    }
}
