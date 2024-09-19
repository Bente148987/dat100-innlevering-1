package no.hvl.dat100;

import javax.swing.JOptionPane;

public class O1 {
    public static void main(String[] args) {
        // Les inn bruttoinntekt fra brukeren via en dialogboks
        String inntektStr = JOptionPane.showInputDialog("Skriv inn din bruttoinntekt:");
        double bruttoInntekt = Double.parseDouble(inntektStr); // Konverterer til double

        double trinnskatt = 0;

        // Beregn trinnskatt basert på bruttoinntekt og gjeldende satser for 2024
        if (bruttoInntekt > 208050 && bruttoInntekt <= 297900) {
            trinnskatt = (bruttoInntekt - 208050) * 0.014;
        } else if (bruttoInntekt > 297900 && bruttoInntekt <= 797000) {
            trinnskatt = (297900 - 208050) * 0.014 + (bruttoInntekt - 297900) * 0.034;
        } else if (bruttoInntekt > 797000 && bruttoInntekt <= 1186500) {
            trinnskatt = (297900 - 208050) * 0.014 + (797000 - 297900) * 0.034 + (bruttoInntekt - 797000) * 0.134;
        } else if (bruttoInntekt > 1186500) {
            trinnskatt = (297900 - 208050) * 0.014 + (797000 - 297900) * 0.034 + (1186500 - 797000) * 0.134 + (bruttoInntekt - 1186500) * 0.164;
        }

        // Vis trinnskatten i en dialogboks
        String resultat = String.format("Trinnskatten for en bruttoinntekt på %.2f kr er: %.2f kr", bruttoInntekt, trinnskatt);
        JOptionPane.showMessageDialog(null, resultat);
    }
}
