public class FrazioneC {

    private int numeratore;
    private int denominatore;

    public FrazioneC() {
        this.numeratore = 0;
        this.denominatore = 1;
    }

    public FrazioneC(int num, int den) {
        if (den == 0) {
            throw new IllegalArgumentException("Il denominatore non può essere zero.");
        }
        this.numeratore = num;
        this.denominatore = den;
        riduci();
    }

    public FrazioneC reciproco() {
        return new FrazioneC(denominatore, numeratore);
    }

    public int confronta(FrazioneC f) {
        int confronto = this.numeratore * f.denominatore - this.denominatore * f.numeratore;
        if (confronto > 0) {
            return 1;
        } else if (confronto < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public double toDouble() {
        return (double) numeratore / denominatore;
    }

    public String toFrazioneMista() {
        if (Math.abs(numeratore) < Math.abs(denominatore)) {
            return rappresenta();
        }
        int intero = numeratore / denominatore;
        int nuovoNumeratore = Math.abs(numeratore % denominatore);
        if (nuovoNumeratore == 0) {
            return String.valueOf(intero);
        } else {
            return intero + " " + nuovoNumeratore + "/" + Math.abs(denominatore);
        }
    }

    public String rappresenta() {
        return numeratore + "/" + denominatore;
    }

    private void riduci() {
        int gcd = mcd(numeratore, denominatore);
        numeratore /= gcd;
        denominatore /= gcd;
    }

    private int mcd(int a, int b) {
        return (b == 0) ? Math.abs(a) : mcd(b, a % b);
    }

    public static void main(String[] args) {
        FrazioneC f1 = new FrazioneC(3, 4);
        System.out.println("Frazione: " + f1.rappresenta());
        System.out.println("Reciproco: " + f1.reciproco().rappresenta());

        FrazioneC f2 = new FrazioneC(7, 3);
        System.out.println("Frazione impropria: " + f2.rappresenta());
        System.out.println("Frazione mista di " + f2.rappresenta() + ": " + f2.toFrazioneMista());

        System.out.println("Confronto tra " + f1.rappresenta() + " e " + f2.rappresenta() + ": " + f1.confronta(f2));
        System.out.println("Valore decimale di " + f1.rappresenta() + ": " + f1.toDouble());
    }
}
