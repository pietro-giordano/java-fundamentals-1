package org.lessons.java;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Inserisci un numero compreso tra 1 e 1000");
            int userInput = scanner.nextInt();

            if (userInput < 1 || userInput > 1000) {
                System.out.println("Numero non valido");
            } else {
                for (int i = 1; i <= userInput; i++) {
                    if (i % 3 == 0 && i % 5 == 0) {
                        System.out.print("FizzBuzz ");
                    } else if (i % 3 == 0) {
                        System.out.print("Fizz ");
                    } else if (i % 5 == 0) {
                        System.out.print("Buzz ");
                    } else {
                        System.out.print(i + " ");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Ti ho chiesto un numero... Riavvia e riprova");
        }
    }
}
