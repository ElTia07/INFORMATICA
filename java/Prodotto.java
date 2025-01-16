public class Prodotto {
    private String nome;
    private double prezzo;
    private int quantita;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            this.nome = "Sconosciuto";
            System.out.println("Errore: nome non valido. Impostato a \"Sconosciuto\".");
        }
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        if (prezzo > 0) {
            this.prezzo = prezzo;
        } else {
            this.prezzo = 0.0;
            System.out.println("Errore: il prezzo deve essere maggiore di zero. Impostato a 0.0.");
        }
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        if (quantita >= 0) {
            this.quantita = quantita;
        } else {
            this.quantita = 0;
            System.out.println("Errore: la quantità deve essere maggiore o uguale a zero. Impostata a 0.");
        }
    }

    public double calcolaValoreTotale() {
        return prezzo * quantita;
    }

    public static void main(String[] args) {
        Prodotto prodotto = new Prodotto();

        prodotto.setNome("Matita");
        prodotto.setPrezzo(2);
        prodotto.setQuantita(7);

        System.out.println("Nome: " + prodotto.getNome());
        System.out.println("Prezzo: " + prodotto.getPrezzo());
        System.out.println("Quantità: " + prodotto.getQuantita());
        System.out.println("Valore totale: " + prodotto.calcolaValoreTotale());
    }
}
