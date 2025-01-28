/* Obiettivo: Creare una gerarchia di classi che rappresenti veicoli generici e specifici.
Istruzioni:
Definire una classe base Veicolo con:
Attributi marca (String) e modello (String).
Un costruttore per inizializzare gli attributi.
Un metodo stampaDettagli() che stampi la marca e il modello.
Creare due classi derivate:
Auto, con un attributo aggiuntivo numeroPorte (int) e un costruttore che utilizzi super per inizializzare gli attributi della classe base.
Moto, con un attributo aggiuntivo haSidecar (boolean) e un costruttore che utilizzi super.
Sovrascrivere il metodo stampaDettagli() in entrambe le sottoclassi per includere i nuovi attributi.
Nel metodo main, creare oggetti di tipo Auto e Moto e stampare i dettagli.
*/
class Veicolo {
    String marca;
    String modello;

    public Veicolo(String marca, String modello) {
        this.marca = marca;
        this.modello = modello;
    }

      public void stampaDettagli() {
        System.out.println("Marca: " + marca + ", Modello: " + modello);
    }
}
    class Auto extends Veicolo {
        
        int numeroPorte;

        public Auto(String marca, String modello, int numeroPorte) {
        super(marca, modello);
        this.numeroPorte = numeroPorte;
    }
    @Override 
    public void stampaDettagli() {
        System.out.println("Marca: " + marca + ", Modello: " + modello + ", Numero di Porte: " + numeroPorte);
    }
}
    class Moto extends Veicolo {
        boolean haSidecar;

    public Moto(String marca, String modello, boolean haSidecar) {
        super(marca, modello);
        this.haSidecar = haSidecar;
    }
    @Override
    public void stampaDettagli() {
        System.out.println("Marca: " + marca + ", Modello: " + modello + ", Sidecar: " + (haSidecar ? "Sì" : "No"));
    }
}
public class Veicolo2 {
    public static void main(String[] args) {
        Auto auto = new Auto("Nissan", "XTrail", 5);
        Moto moto = new Moto("Harley-Davidson", "Softail", false);
        auto.stampaDettagli();
        moto.stampaDettagli();
    }
}

    