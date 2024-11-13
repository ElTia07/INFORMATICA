public class FrazSem {
    private int numeratore;
    private int denominatore;

    public FrazSem() {
        this.numeratore = 0;
        this.denominatore = 1; 
    }

    public FrazSem(int num, int den) {
        if (den == 0) {
            throw new IllegalArgumentException("Il denominatore non può essere zero.");
        }
        this.numeratore = num;
        this.denominatore = den;
    }

    public String rappresenta() {
        return numeratore + "/" + denominatore;
    }

    public static void main(String[] args) {

        FrazSem f0 = new FrazSem();
        System.out.println("Frazione di default: " + f0.rappresenta());

        FrazSem f1 = new FrazSem(2, 5);
        System.out.println("Frazione con parametri: " + f1.rappresenta());
    }
}

