import java.util.Scanner;

public class arrayC {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Carol", "David", "Eve"};
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Inserisci un nome: ");
        String input = scanner.nextLine();
        boolean found = false;

        for (String name : names) {
            if (name.equalsIgnoreCase(input)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Nome trovato.");
        } else {
            System.out.println("Nome non trovato.");
        }
    }
}
