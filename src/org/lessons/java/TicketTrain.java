package org.lessons.java;

import java.util.Scanner;

public class TicketTrain {
    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);

        double priceForKm = 0.21;
        double underageDiscount = 0.8;
        double overageDiscount = 0.6;

        System.out.println("Inserisci chilometri da percorrere");
        int userKm = scanner.nextInt();
        System.out.println("Adesso inserisci la tua età");
        int userAge = scanner.nextInt();

        double ticketPrice = userKm * priceForKm;

        if (userAge <= 18) {
            double finalPrice = ticketPrice * underageDiscount;
            System.out.println("Il prezzo con sconto minorenni applicato è uguale a " + finalPrice + " €");
        } else if (userAge >= 65) {
            double finalPrice = ticketPrice * overageDiscount;
            System.out.println("Il prezzo con sconto over 65 applicato è uguale a " + finalPrice + " €");
        } else {
            System.out.println("Il prezzo da pagare è uguale a " + ticketPrice + " €");
        }
    }
}
