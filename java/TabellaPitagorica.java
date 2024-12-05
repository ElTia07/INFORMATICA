// Programma per creare e stampare la tabella pitagorica 12x12

public class TabellaPitagorica {
    public static void main(String[] args) {
        // Creo la tabella 12 x 12
        int[][] tabella = new int[12][12];

        // riempi la matrice 
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                tabella[i][j] = (i + 1) * (j + 1);
            }
        }

        // Stampa della tabella utilizzando un ciclo for-each
        System.out.println("Tabella pitagorica (utilizzando il ciclo for-each):");
        for (int[] riga : tabella) { 
            for (int elemento : riga) { 
                System.out.printf("%4d", elemento); 
            }
            System.out.println(); // Va a capo dopo ogni riga
        }

        System.out.println(); // Riga vuota per separare le due stampe delle tabelle

        // Stampa della tabella utilizzando un ciclo for normale
        System.out.println("Tabella pitagorica (utilizzando il ciclo for):");
        for (int i = 0; i < tabella.length; i++) { 
            for (int j = 0; j < tabella[i].length; j++) { 
                System.out.printf("%4d", tabella[i][j]); 
            }
            System.out.println(); // Va a capo dopo ogni riga
        }
    }
}
