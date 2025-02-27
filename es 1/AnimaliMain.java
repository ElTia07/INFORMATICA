interface Animale {
    void verso();
    void muoviti();
}

interface Parlante {
    void parla();
    void saluta();
}

class Pappagallo implements Animale, Parlante {
    public void verso() {
        System.out.println("Il pappagallo fischietta");
    }
    public void muoviti() {
        System.out.println("Il pappagallo vola");
    }
    public void parla() {
        System.out.println("Il pappagallo dice: cambia scuola");
    }
    public void saluta() {
        System.out.println("Il pappagallo saluta con un regalino sulla maglietta");
    }
}

class Cane implements Animale {
    public void verso() {
        System.out.println("Il cane abbaia");
    }
    public void muoviti() {
        System.out.println("Il cane ti salta addosso");
    }
}

class Gatto implements Animale {
    public void verso() {
        System.out.println("Il gatto miagola");
    }
    public void muoviti() {
        System.out.println("Il gatto cammina in modo ninja");
    }
}

public class AnimaliMain {
    public static void main(String[] args) {
        Animale[] animali = {new Pappagallo(), new Cane(), new Gatto()};
        
        for (Animale animale : animali) {
            animale.verso();
            animale.muoviti();
            System.out.println();
        }
        
        Pappagallo pappagallo = new Pappagallo();
        pappagallo.parla();
        pappagallo.saluta();
    }
}
