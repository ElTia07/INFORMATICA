/* array1.java
* Questo programma inizializza un array chiamato vet1 con 10 numeri interi casuali compresi tra 0 e 20.
* Legge due argomenti da linea di comando:
* 1. Il primo argomento può essere "-a" o "-m".
*   - "-a": aggiunge il valore del secondo argomento a tutti gli elementi di vet1.
*    - "-m": moltiplica il valore del secondo argomento a tutti gli elementi di vet1.
* 2. Segnala un errore se i parametri non sono passati in modo corretto.
*/

import java.util.Random;

public class array1 {
    public static void main(String[] args) {
        // Inizializzo l'array vet1 con 10 numeri casuali da 0 a 20
        int[] vet1 = new int[10];
        Random random = new Random();
        for (int i = 0; i < vet1.length; i++) {
            vet1[i] = random.nextInt(21); // Numeri random da 0 a 20
        }

        // Controlla che ci siano 2 parametri scritti dall'utente
        if (args.length != 2) {
            System.err.println("Errore: Numero di parametri non valido. Usa '-a' o '-m' seguito da un numero.");
            return;
        }

        String operazione = args[0];
        int value = 2;

        // Stampa l'array iniziale
        System.out.println("Array iniziale:");
        for (int num : vet1) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Applica l'operazione sull'array vet1
        switch (operazione) {
            case "-a":
                // Somma il valore a tutti gli elementi del vettore
                for (int i = 0; i < vet1.length; i++) {
                    vet1[i] += value;
                }
                System.out.println("Ho eseguito la somma");
                break;

            case "-m":
                // Moltiplica il valore a tutti gli elementi del vettore
                for (int i = 0; i < vet1.length; i++) {
                    vet1[i] *= value;
                }
                System.out.println("Ho moltiplicato i valori.");
                break;

            default:
                // Segnala errore se non inseriamo -a o -m
                System.err.println("Errore: Il primo argomento deve essere '-a' o '-m'.");
                return;
        }

        // Stampa l'array con l'operazione eseguita
        System.out.println("Array risultante:");
        for (int num : vet1) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
