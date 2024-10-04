import java.util.Scanner;

public class EquazioneSecondoGrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il valore di a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Inserisci il valore di b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Inserisci il valore di c: ");
        double c = scanner.nextDouble();

        // Calcola il discriminante (delta)
        double discriminante = b * b - 4 * a * c;

        if (discriminante > 0) {
            // Due soluzioni distinte
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.printf("Le soluzioni sono: x1 = %.2f e x2 = %.2f%n", x1, x2);
        } else if (discriminante == 0) {
            // Una soluzione doppia
            double x = -b / (2 * a);
            System.out.printf("C'è una soluzione doppia: x1 = x2 = %.2f%n", x);
        } else {
            // Nessuna soluzione reale
            System.out.println("Non ci sono soluzioni reali (delta è negativo).");
        }

        // Chiude lo scanner
        scanner.close();
    }
}
