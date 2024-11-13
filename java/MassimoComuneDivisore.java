import java.util.Scanner;

public class MassimoComuneDivisore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il primo numero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Inserisci il secondo numero: ");
        int numero2 = scanner.nextInt();

        int mcd = calcolaMCD(numero1, numero2);

        System.out.println("Il Massimo Comune Divisore di " + numero1 + " e " + numero2 + " è: " + mcd);
        scanner.close();
    }

    private static int calcolaMCD(int a, int b) {
        // Algoritmo di Euclide
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;  // Quando b è 0, a contiene il MCD
    }
}
