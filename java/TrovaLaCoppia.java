import java.util.Random;
import java.util.Scanner;

public class TrovaLaCoppia {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] numeri = new int[6];
        for (int i = 0; i < numeri.length; i++) {
            numeri[i] = random.nextInt(20) + 1;
        }

        System.out.print("Array generato: ");
        for (int num : numeri) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Inserisci il numero target: ");
        int target = scanner.nextInt();

        System.out.println("Coppie trovate:");
        boolean coppiaTrovata = false;
        for (int i = 0; i < numeri.length; i++) {
            for (int j = i; j < numeri.length; j++) {
                if (numeri[i] + numeri[j] == target) {
                    System.out.println("(" + numeri[i] + ", " + numeri[j] + ")");
                    coppiaTrovata = true;
                }
            }
        }

        if (!coppiaTrovata) {
            System.out.println("Nessuna coppia trovata con somma uguale a " + target + ".");
        }

        scanner.close();
    }
}
