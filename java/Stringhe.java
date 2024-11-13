import java.util.Scanner;

public class Stringhe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Inserisci una stringa: ");
        String frase = scanner.nextLine();

        int lunghezza = frase.length();
        
        char carattereCentrale = frase.charAt(lunghezza / 2); 
        
        // Converte la prima lettera della frase in maiuscolo
        String fraseConInizialeMaiuscola = frase.substring(0, 1).toUpperCase() + frase.substring(1);
        
        // Conta le occorrenze del carattere 'a'
        int contatoreA = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'A') {
                contatoreA++;
            }
        }

        String sottostringa = frase.substring(0, 4);
        String fraseMaiuscola = frase.toUpperCase();
        String fraseMinuscola = frase.toLowerCase();
        
        // Stampa i risultati
        System.out.println("Lunghezza della stringa: " + lunghezza);
        System.out.println("Carattere in posizione centrale: " + carattereCentrale);
        System.out.println("Frase con iniziale maiuscola: " + fraseConInizialeMaiuscola);
        System.out.println("Numero di occorrenze del carattere 'a': " + contatoreA);
        System.out.println("La sottostringa dal primo al quarto carattere: " + sottostringa);
        System.out.println("La stringa in maiuscolo: " + fraseMaiuscola);
        System.out.println("La stringa in minuscolo: " + fraseMinuscola);
        
        scanner.close();
    }
}
