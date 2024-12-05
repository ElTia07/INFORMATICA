/*
Definito un Array che contiene istanze della classe Auto
Class Auto{String modello; int posti;}
Auto[] automobili = {new Auto("Fiat 500", 4), new Auto("Ford Galaxy", 7),
new Auto("Toyota Sienna", 7), new Auto("Volkswagen Touran", 7), new Auto("Opel Corsa", 5)};
utilizzando il ciclo for-each trovare tutte le auto che hanno 7 posti
*/

class Auto {
    String modello;
    int posti;

    // Costruttore della classe Auto
    Auto(String modello, int posti) {
        this.modello = modello;
        this.posti = posti;
    }
}

public class array2 {
    public static void main(String[] args) {
        // Definizione dell'array di istanze Auto
        Auto[] automobili = {
            new Auto("Fiat 500", 4),
            new Auto("Ford Galaxy", 7),
            new Auto("Toyota Sienna", 7),
            new Auto("Volkswagen Touran", 7),
            new Auto("Opel Corsa", 5)
        };

        // Mostrare tutte le auto con 7 posti
        System.out.println("Auto con 7 posti:");
        for (Auto auto : automobili) {
            if (auto.posti == 7) {
                System.out.println(auto.modello);
            }
        }
    }
}
