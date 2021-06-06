package org.example;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Asad merouani
 */


import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String answer;

        App app = new App();
        System.out.println("Enter 'C' to convert from Fahrenheit to Celsius.");
        System.out.println("Enter 'F' to convert from Celsius to Fahrenheit.");

        answer = scanner.nextLine();
        if (answer.equals("C") || answer.equals("c")) {
            app.converFahToCals();
        } else if(answer.equals("F") || answer.equals("f")){
            app.converCalsToFah();
        }else {
            System.out.println("Please. enter a valid choice.");
        }

    }

    private void converCalsToFah() {
        float cels, farh;
        System.out.println("Please enter the temperature in Celsius:");
        cels = Integer.parseInt(scanner.nextLine());

        System.out.printf("The temperature in Fahrenheit is %.2f", ( cels* 9 / 5) + 32);
    }

    private void converFahToCals() {
        float cels, farh;
        System.out.println("Please enter the temperature in Fahrenheit:");
        farh = Integer.parseInt(scanner.nextLine());

        System.out.printf("The temperature in Celsius is %.2f", (farh - 32) * 5 / 9);
    }


}
