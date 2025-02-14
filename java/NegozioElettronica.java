/*7. Esercizio: Gestione di un Negozio di Elettronica
Obiettivo: Creare una gerarchia di classi per gestire diversi tipi di prodotti elettronici.

Istruzioni:
Creare una classe base ProdottoElettronico con:
Attributi nome (String) e prezzo (double).
Un metodo stampaDettagli() che stampa il nome e il prezzo.
Creare due sottoclassi:
Smartphone, che aggiunga attributi marca (String) e memoria (int) e sovrascriva stampaDettagli() per includere marca e memoria.
Televisore, che aggiunga attributi dimensioneSchermo (int) e risoluzione (String) e sovrascriva stampaDettagli() per includere dimensione e risoluzione.
Nel metodo main, creare oggetti di tipo Smartphone e Televisore e stampare i dettagli.
Esempio di Output:

Nome: iPhone, Prezzo: 1000.0, Marca: Apple, Memoria: 128GB
Nome: Samsung TV, Prezzo: 800.0, Dimensione: 55", Risoluzione: 4K
Gandelli Mattia 4 G
*/
class ProdottoElettronico{
    private String nome;
    private double prezzo;

    public ProdottoElettronico(String nome, double prezzo){
        this.nome = nome;
        this.prezzo = prezzo;
    }
    public void stampaDettagli(){
        System.out.println("Nome: " + nome + ", Prezzo: " + prezzo + "$");
    }
}
class Smartphone extends ProdottoElettronico {
    private String marca;
    private int memoria;
    
    public Smartphone(String nome, double prezzo, String marca, int memoria) {
        super(nome, prezzo);
        this.marca = marca;
        this.memoria = memoria;
    }

    @Override 
    public void stampaDettagli() {
        super.stampaDettagli();
        System.out.println("Marca: "+ marca + ", Memoria: " + memoria + "Giga");
    }
}
class Televisore extends ProdottoElettronico {
    private int dimensioneSchermo;
    private String risoluzione;

    public Televisore(String nome, double prezzo, int dimensioneSchermo, String risoluzione) {
        super(nome, prezzo);
        this.dimensioneSchermo = dimensioneSchermo;
        this.risoluzione = risoluzione;
    }

    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
        System.out.println("Dimensione Schermo: " + dimensioneSchermo + " pollici, Risoluzione: " + risoluzione);
    }
}

public class NegozioElettronica {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("iPhone 16 Pro Max", 1599.99, "Apple", 256);
        Televisore televisore = new Televisore("Samsung QLED", 1499.99, 55, "4K UHD");

        smartphone.stampaDettagli();
        System.out.println();
        televisore.stampaDettagli();
    }
}


