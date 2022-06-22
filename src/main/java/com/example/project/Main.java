package com.example.project;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double firstN, secondN, operation;

        System.out.println("Enter 1 for add");
        System.out.println("Enter 2 for subtract");
        System.out.println("Enter 3 for multiplication");
        System.out.println("Enter 4 for divide");
        operation = scan.nextDouble();

        System.out.println("Enter first number: ");
        firstN = scan.nextDouble();

        System.out.println("Enter second number: ");
        secondN = scan.nextDouble();

        if (operation == 1) {
            Calculator addition = new Calculator();
            double answer = addition.add(firstN, secondN);
            System.out.println(answer);
        }

        if (operation == 2) {
            Calculator subtraction = new Calculator();
            double answer = subtraction.subtract(firstN, secondN);
            System.out.println(answer);
        }

        if (operation == 3) {
            Calculator multiplication = new Calculator();
            double answer = multiplication.multiply(firstN, secondN);
            System.out.println(answer);
        }

        if (operation == 4) {
            Calculator division = new Calculator();
            double answer = division.divide(firstN, secondN);
            System.out.println(answer);
        }
    }
}
