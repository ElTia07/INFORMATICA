class Saluto extends Thread {
    public Saluto(String nomeThread) {
        super(nomeThread);
    }

    @Override
    public void run() {
        System.out.println("Thread che saluta. Creato come estensione della classe Thread");
    }
}

public class Main {
    public static void main(String[] args) {
        Saluto saluto = new Saluto("SalutoThread");
        saluto.start();

        Runnable mioSaluto = () -> System.out.println("Thread eseguito tramite runnable");
        Thread threadRunnable = new Thread(mioSaluto);
        threadRunnable.start();

        Thread lambdaThread = new Thread(() -> System.out.println("Sto usando una lamda expression"));
        lambdaThread.start();
    }
}




