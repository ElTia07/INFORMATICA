/* Crea una classe base Forma con i seguenti attributi e metodi:

Attributi: nome (una stringa che descrive il tipo di forma, ad esempio "Cerchio", "Rettangolo").
Metodi:
calcolaArea(): restituisce 0 (sarà sovrascritto nelle sottoclassi).
calcolaPerimetro(): restituisce 0 (sarà sovrascritto nelle sottoclassi).
descrizione(): stampa il nome della forma.
Crea le seguenti sottoclassi che estendono Forma:

Cerchio: aggiunge un attributo raggio e implementa i metodi calcolaArea() e calcolaPerimetro() usando le formule appropriate.
Rettangolo: aggiunge gli attributi base e altezza e implementa i metodi calcolaArea() e calcolaPerimetro().
Triangolo: aggiunge gli attributi base, altezza e lato1, lato2, lato3 (per il perimetro) e implementa i metodi calcolaArea() e calcolaPerimetro().
 */

class Forma {
    String nome;

    public Forma(String nome) {
        this.nome = nome;
    }

    public double calcolaArea() {
        return 0;
    }

    public double calcolaPerimetro() {
        return 0;
    }

    public void descrizione() {
        System.out.println("Forma: " + nome);
    }
}

class Cerchio extends Forma {
    double raggio;

    public Cerchio(double raggio) {
        super("Cerchio");
        this.raggio = raggio;
    }

    @Override
    public double calcolaArea() {
        return Math.PI * raggio * raggio;
    }

    @Override
    public double calcolaPerimetro() {
        return 2 * Math.PI * raggio;
    }
}

class Rettangolo extends Forma {
    double base, altezza;

    public Rettangolo(double base, double altezza) {
        super("Rettangolo");
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double calcolaArea() {
        return base * altezza;
    }

    @Override
    public double calcolaPerimetro() {
        return 2 * (base + altezza);
    }
}

class Triangolo extends Forma {
    double base, altezza, lato1, lato2, lato3;

    public Triangolo(double base, double altezza, double lato1, double lato2, double lato3) {
        super("Triangolo");
        this.base = base;
        this.altezza = altezza;
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
    }

    @Override
    public double calcolaArea() {
        return (base * altezza) / 2;
    }

    @Override
    public double calcolaPerimetro() {
        return lato1 + lato2 + lato3;
    }
}
public class Forma2 {
    public static void main(String[] args) {
        Forma cerchio = new Cerchio(5);
        Forma rettangolo = new Rettangolo(4, 6);
        Forma triangolo = new Triangolo(4, 3, 4, 3, 5);
        cerchio.descrizione();
        rettangolo.descrizione();
        triangolo.descrizione();

        System.out.println("Area cerchio: " + cerchio.calcolaArea());
        System.out.println("Perimetro cerchio: " + cerchio.calcolaPerimetro());

        System.out.println("Area rettangolo: " + rettangolo.calcolaArea());
        System.out.println("Perimetro rettangolo: " + rettangolo.calcolaPerimetro());

        System.out.println("Area triangolo: " + triangolo.calcolaArea());
        System.out.println("Perimetro triangolo: " + triangolo.calcolaPerimetro());
    }
}


