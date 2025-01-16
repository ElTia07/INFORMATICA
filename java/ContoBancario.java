public class ContoBancario {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Errore: Il saldo non può essere negativo.");
        }
    }

    public void deposita(double importo) {
        if (importo > 0) {
            saldo += importo;
        } else {
            System.out.println("Errore: L'importo da depositare deve essere positivo.");
        }
    }

    public void preleva(double importo) {
        if (importo > 0 && importo <= saldo) {
            saldo -= importo;
        } else if (importo > saldo) {
            System.out.println("Errore: Saldo insufficiente per completare l'operazione.");
        } else {
            System.out.println("Errore: L'importo da prelevare deve essere positivo.");
        }
    }

    public static void main(String[] args) {
        ContoBancario conto = new ContoBancario();

        System.out.println("Saldo iniziale: " + conto.getSaldo());

        conto.deposita(100.0);
        System.out.println("Deposito: 100.0");

        conto.preleva(50.0);
        System.out.println("Prelievo: 50.0");

        System.out.println("Saldo finale: " + conto.getSaldo());
    }
}