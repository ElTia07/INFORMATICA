abstract class Animale {
    abstract void emettiVerso();
    
    void dormi() {
        System.out.println("Zzz...");
    }
}

class Cane extends Animale {
    @Override
    void emettiVerso() {
        System.out.println("Bau!");
    }
}

class Gatto extends Animale {
    @Override
    void emettiVerso() {
        System.out.println("Miao!");
    }
}
public class Main  {
    public static void main(String[] args) {
        Animale[] animali = {new Cane(), new Gatto(), new Cane()};
    
        for (Animale animale : animali) {
            animale.emettiVerso();
        }
    }
}