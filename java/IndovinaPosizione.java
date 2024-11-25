import java.util.Random;
import java.util.Scanner;

public class IndovinaPosizione {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] numeri = new int[10];
        for (int i = 0; i < numeri.length; i++) {
            numeri[i] = random.nextInt(100) + 1;
        }

        int posizioneSegreta = random.nextInt(10);
        int valoreSegreto = numeri[posizioneSegreta];

        System.out.println("Prova a giocare ad 'Indovina la Posizione'!");
        System.out.println("Ho selezionato un valore segreto da un array di 10 numeri casuali.");
        System.out.println("Prova a indovinare il valore! Ti darò suggerimenti come 'troppo alto' o 'troppo basso'.");

        boolean indovinato = false;
        while (!indovinato) {
            System.out.print("Inserisci la tua ipotesi: ");
            int tentativo = scanner.nextInt();

            if (tentativo < valoreSegreto) {
                System.out.println("Troppo basso! Ritenta.");
            } else if (tentativo > valoreSegreto) {
                System.out.println("Troppo alto! Ritenta.");
            } else {
                System.out.println("Congratulazioni! Hai indovinato il valore segreto: " + valoreSegreto);
                indovinato = true;
            }
        }

        System.out.println("Ecco l'array completo: ");
        for (int i = 0; i < numeri.length; i++) {
            System.out.println("Posizione " + i + ": " + numeri[i]);
        }

        scanner.close();
    }
}
