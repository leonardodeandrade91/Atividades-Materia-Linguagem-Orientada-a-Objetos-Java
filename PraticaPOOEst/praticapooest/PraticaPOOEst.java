package praticapooest;

public class PraticaPOOEst {
    public static void main(String[] args) {
        Ventilador.ligar(3);
        Ventilador.ligar(2);
        Ventilador.desligar();
        
        System.out.println(Ventilador.getLigado());
    }
}