import java.util.Scanner;

public class StringheB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci la prima stringa:");
        String string1 = scanner.nextLine();
        System.out.println("Inserisci la seconda stringa:");
        String string2 = scanner.nextLine();

        if (string1.equalsIgnoreCase(string2)) {
            System.out.println("Le due stringhe sono uguali (ignorando maiuscole/minuscole).");
        } else {
            System.out.println("Le due stringhe sono diverse.");
        }

        System.out.println("Inserisci una stringa per visualizzare i primi 5 caratteri:");
        String string3 = scanner.nextLine();
        
        if (string3.length() >= 5) {
            System.out.println("I primi 5 caratteri sono: " + string3.substring(0, 5));
        } else {
            System.out.println("La stringa inserita è troppo corta. Ha solo " + string3.length() + " caratteri.");
        }

        System.out.println("Inserisci un'altra stringa per visualizzare gli ultimi 5 caratteri:");
        String string4 = scanner.nextLine();
        
        if (string4.length() >= 5) {
            System.out.println("Gli ultimi 5 caratteri sono: " + string4.substring(string4.length() - 5));
        } else {
            System.out.println("La stringa inserita è troppo corta. Ha solo " + string4.length() + " caratteri.");
        }

        System.out.println("Inserisci una frase:");
        String frase = scanner.nextLine();
        String[] parole = frase.split("\\s+");

        String parolaPiuLunga = "";
        for (String parola : parole) {
            if (parola.length() > parolaPiuLunga.length()) {
                parolaPiuLunga = parola;
            }
        }

        System.out.println("La parola più lunga è: " + parolaPiuLunga);

        System.out.println("Le parole della frase sono:");
        for (String parola : parole) {
            System.out.println(parola);
        }

        scanner.close();
    }
}

