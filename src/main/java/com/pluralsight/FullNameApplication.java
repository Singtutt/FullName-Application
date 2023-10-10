package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//  User input section (Full Name Retrieval)
        System.out.println("Welcome! Please enter your name: ");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine().trim();

        System.out.println("Last Name: ");
        String lastName = scanner.nextLine().trim();

        System.out.println("Middle Name, if any (Press Enter to Skip): ");
        String middleName = scanner.nextLine().trim();

        System.out.println("Suffix, if any (Press Enter to Skip): ");
        String suffix = scanner.nextLine().trim();

//  Create full name based off user inputs (StringBuilder)
        StringBuilder fullNameBuilder = new StringBuilder();
        fullNameBuilder.append(firstName).append(" ").append(lastName);

        if (!middleName.isEmpty()) {
            fullNameBuilder.append(" ").append(middleName);
        }

        if (!suffix.isEmpty()) {
            fullNameBuilder.append(", ").append(suffix);
        }

        String fullName = fullNameBuilder.toString();

        System.out.println("Your full name is: " + fullName);

        scanner.close();
    }
}
