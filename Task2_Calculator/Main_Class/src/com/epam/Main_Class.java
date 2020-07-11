package com.epam;

import java.util.Scanner;

public class Main_Class {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int firstNumber;
        int secondNumber;

        System.out.println("Write a number");
        firstNumber = Integer.parseInt(input.nextLine());

        System.out.println("Write another number");
        secondNumber = Integer.parseInt(input.nextLine());
        Calculator c =new Calculator();
        c.sum(firstNumber,secondNumber);
        c.difference(firstNumber, secondNumber);
        c.product(firstNumber, secondNumber);
        c.divide(firstNumber, secondNumber);
    }

}

