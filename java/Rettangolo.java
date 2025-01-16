public class Rettangolo {
    private int larghezza;
    private int altezza;

    public Rettangolo() {
        this.larghezza = 1;
        this.altezza = 1;
    }

    public int getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(int larghezza) {
        if (larghezza > 0) {
            this.larghezza = larghezza;
        } else {
            System.out.println("Errore: larghezza non valida. Impostato a 1.");
            this.larghezza = 1;
        }
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        if (altezza > 0) {
            this.altezza = altezza;
        } else {
            System.out.println("Errore: altezza non valida. Impostato a 1.");
            this.altezza = 1;
        }
    }

    public int calcolaArea() {
        return larghezza * altezza;
    }

    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo();

        rettangolo.setLarghezza(8);
        rettangolo.setAltezza(10);

        System.out.println("Larghezza del rettangolo: " + rettangolo.getLarghezza());
        System.out.println("Altezza del rettangolo: " + rettangolo.getAltezza());
        System.out.println("Area del rettangolo: " + rettangolo.calcolaArea());
    }
}


