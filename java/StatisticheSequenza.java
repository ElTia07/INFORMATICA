public class StatisticheSequenza {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Errore: Inserisci una sequenza di numeri reali come argomenti.");
            return;
        }

        double somma = 0;
        int count = 0;

        double primoNumero = Double.parseDouble(args[0]);
        double max = primoNumero;
        double min = primoNumero;

        somma += primoNumero;
        count++;

        for (int i = 1; i < args.length; i++) {
            double numero = Double.parseDouble(args[i]);

            somma += numero;
            count++;

            if (numero > max) {
                max = numero;
            }

            if (numero < min) {
                min = numero;
            }
        }

        double media = somma / count;


        System.out.println("Somma: " + somma);
        System.out.println("Media: " + media);
        System.out.println("Massimo: " + max);
        System.out.println("Minimo: " + min);
    }
}
