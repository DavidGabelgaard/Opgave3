package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Task 3.1

        int tal1 = 5;

        System.out.printf("%d \n" , tal1);

        //Exception in thread "main" java.util.MissingFormatArgumentException: Format specifier '%f'

        //task 3.2

        System.out.println("Enter a temperature in Celsius: ");

        Scanner input = new Scanner(System.in);

        int Celsius = input.nextInt();

        double F = Celsius * (9.0/5.0) + 32;

        System.out.println(Celsius + " C = " + F + " F"  );

        //task 3.3

        System.out.println("Input a number of seconds");

        int Seconds  = input.nextInt();

        int Hours =  Seconds / (60 * 60);

        int Minuts = Seconds % (60*60) / 60;

        int SecondsRemaining = Seconds % (60*60) % 60;

        System.out.printf("%d seconds = %d hours, %d minuts, and %d seconds", Seconds , Hours , Minuts , SecondsRemaining);

        //Task 3.4

        System.out.println("\n" + "I'm thinking of a number between 1 and 100." +"\nCan you guess what it is?" );

        System.out.println("Type a number");

        int Guess = input.nextInt();

        System.out.println("Your guess is: " + Guess);

        Random random = new Random();

        int RandomNumber = random.nextInt(100) + 1;

        if (Guess == RandomNumber) {
            System.out.println("You guessed right the number was " + Guess);
        } else {
            System.out.println("The number I was thinking of is: " + RandomNumber);

            System.out.println("You were off by: "+ Math.abs (RandomNumber - Guess));
        }






    }
}
