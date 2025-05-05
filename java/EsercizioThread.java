public class EsercizioThread {
    public static class MioThread extends Thread {
        public MioThread(String nome) {
            super(nome);
        }

        @Override
        public void run() {
            System.out.println("Esecuzione del thread tramite ereditarietà: " + getName());
        }
    }

    public static class MioRunnable implements Runnable {
        private String nome;

        public MioRunnable(String nome) {
            this.nome = nome;
        }

        @Override
        public void run() {
            System.out.println("Esecuzione del thread tramite Runnable: " + nome);
        }
    }

    public static void main(String[] args) {
        MioThread thread1 = new MioThread("Thread-1");
        thread1.start();

        Thread thread2 = new Thread(new MioRunnable("Thread-2"));
        thread2.start();

        Thread thread3 = new Thread(() -> System.out.println("Esecuzione del thread tramite lambda"));
        thread3.start();
    }
}
