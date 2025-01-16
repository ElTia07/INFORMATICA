class Libro {
    private String titolo;
    private String autore;
    private boolean disponibile;

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        if (titolo != null && !titolo.isEmpty()) {
            this.titolo = titolo;
        } else {
            this.titolo = "Sconosciuto";
            System.out.println("Errore: titolo non valido. Impostato a \"Sconosciuto\".");
        }
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        if (autore != null && !autore.isEmpty()) {
            this.autore = autore;
        } else {
            this.autore = "Sconosciuto";
            System.out.println("Errore: autore non valido. Impostato a \"Sconosciuto\".");
        }
    }

    public boolean isDisponibile() {
        return disponibile;
    }

    public void setDisponibile(boolean disponibile) {
        this.disponibile = disponibile;
    }
}

class Biblioteca {
    private Libro[] libri;
    private int indice;

    public Biblioteca(int dimensione) {
        libri = new Libro[dimensione];
        indice = 0;
    }

    public void aggiungiLibro(Libro libro) {
        if (indice < libri.length) {
            libri[indice] = libro;
            indice++;
        } else {
            System.out.println("Errore: La biblioteca è piena, impossibile aggiungere altri libri.");
        }
    }

    public void stampaCatalogo() {
        for (int i = 0; i < indice; i++) {
            Libro libro = libri[i];
            System.out.println("Titolo: " + libro.getTitolo() + ", Autore: " + libro.getAutore() + ", Disponibile: " + (libro.isDisponibile() ? "Sì" : "No"));
        }
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(5);

        Libro libro1 = new Libro();
        libro1.setTitolo("Il Signore degli Anelli");
        libro1.setAutore("J.R.R. Tolkien");
        libro1.setDisponibile(true);

        Libro libro2 = new Libro();
        libro2.setTitolo("CR7 LA BIOGRAFIA");
        libro2.setAutore("Guillem Balague");
        libro2.setDisponibile(false);

        biblioteca.aggiungiLibro(libro1);
        biblioteca.aggiungiLibro(libro2);

        biblioteca.stampaCatalogo();
    }
}
