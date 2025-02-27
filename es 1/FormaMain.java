abstract class Forma {
    abstract double calcolaArea();
}

class Cerchio extends Forma {
    private double raggio;
    
    Cerchio(double raggio) {
        this.raggio = raggio;
    }
    
    @Override
    double calcolaArea() {
        return 3.14 * raggio * raggio;
    }
}

class Rettangolo extends Forma {
    private double base, altezza;
    
    Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    
    @Override
    double calcolaArea() {
        return base * altezza;
    }
}

public class FormaMain {
    public static void main(String[] args) {
        Forma[] forme = {new Cerchio(7), new Rettangolo(8, 4)};
        
        for (Forma forma : forme) {
            System.out.println("Area: " + forma.calcolaArea());
        }
    }
}
