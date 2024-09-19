package no.hvl.dat100;

import java.util.Scanner;

public class O2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Løkke for å lese inn poengsum fra 10 studenter
        for (int i = 1; i <= 10; i++) {
            int poengsum;

            // Gjenta innlesingen til gyldig poengsum er oppgitt
            while (true) {
                System.out.print("Skriv inn poengsum for student " + i + " (0-100): ");
                poengsum = scanner.nextInt();

                // Sjekk om poengsummen er gyldig
                if (poengsum < 0 || poengsum > 100) {
                    System.out.println("Ugyldig poengsum! Poengsum må være mellom 0 og 100. Prøv igjen.");
                } else {
                    break;  // Gyldig poengsum, bryt ut av while-løkken
                }
            }

            // Bestem karakter basert på poengsummen
            char karakter;
            if (poengsum >= 90) {
                karakter = 'A';
            } else if (poengsum >= 80) {
                karakter = 'B';
            } else if (poengsum >= 60) {
                karakter = 'C';
            } else if (poengsum >= 50) {
                karakter = 'D';
            } else if (poengsum >= 40) {
                karakter = 'E';
            } else {
                karakter = 'F';
            }

            // Skriv ut karakteren for studenten
            System.out.println("Student " + i + " får karakter: " + karakter);
        }

        // Lukk scanner
        scanner.close();
    }
}
