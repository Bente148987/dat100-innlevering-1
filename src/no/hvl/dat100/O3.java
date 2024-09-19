package no.hvl.dat100;

import javax.swing.JOptionPane;

public class O3 {
    public static void main(String[] args) {
        // Les inn et heltall n > 0 fra brukeren via en dialogboks
        String nStr = JOptionPane.showInputDialog("Skriv inn et heltall n > 0:");
        int n = Integer.parseInt(nStr);  // Konverterer til int

        // Sjekk om n er større enn 0
        if (n <= 0) {
            JOptionPane.showMessageDialog(null, "Ugyldig input! n må være et heltall større enn 0.");
            return; // Avslutt programmet hvis input er ugyldig
        }

        // Beregn n! (fakultet)
        long fakultet = 1;
        for (int i = 1; i <= n; i++) {
            fakultet *= i;
        }

        // Vis resultatet i en dialogboks
        String resultat = String.format("Fakultet av %d er: %d", n, fakultet);
        JOptionPane.showMessageDialog(null, resultat);
    }
}
