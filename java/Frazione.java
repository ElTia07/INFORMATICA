import java.util.Scanner;

class Frazione {
    int n, d;

    Frazione(int n, int d) { this.n = n; this.d = d; }

    Frazione sottrai(Frazione f) { return new Frazione(n * f.d - f.n * d, d * f.d); }
    Frazione moltiplica(Frazione f) { return new Frazione(n * f.n, d * f.d); }
    Frazione dividi(Frazione f) { return new Frazione(n * f.d, d * f.n); }
    public String toString() { return n + "/" + d; }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Inserisci il numeratore della prima frazione: ");
        int n1 = s.nextInt();
        System.out.print("Inserisci il denominatore della prima frazione: ");
        int d1 = s.nextInt();
        Frazione f1 = new Frazione(n1, d1);
        
        System.out.print("Inserisci il numeratore della seconda frazione: ");
        int n2 = s.nextInt();
        System.out.print("Inserisci il denominatore della seconda frazione: ");
        int d2 = s.nextInt();
        Frazione f2 = new Frazione(n2, d2);

        System.out.println("Sottrazione: " + f1.sottrai(f2));
        System.out.println("Moltiplicazione: " + f1.moltiplica(f2));
        System.out.println("Divisione: " + f1.dividi(f2));
        
        s.close();
    }
}

