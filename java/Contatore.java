public class Contatore {
    private int valore = 0;

    public synchronized void incrementa() {
        valore++;
    }

    public int getValore() {
        return valore;
    }

    public static class ThreadContatore implements Runnable {
        private final Contatore contatore;

        public ThreadContatore(Contatore contatore) {
            this.contatore = contatore;
        }

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                contatore.incrementa();
            }
        }
    }

    public static void main(String[] args) {
        Contatore contatore = new Contatore();
        Thread[] threads = new Thread[5];

        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(new ThreadContatore(contatore));
            threads[i].start();
        }

        for (int i = 0; i < 5; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Valore finale del contatore: " + contatore.getValore());
    }
}
