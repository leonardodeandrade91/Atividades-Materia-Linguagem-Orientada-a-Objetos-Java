package poogetsetconst;

public class POOGetSetConst {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", "Azul", 0.4f);
        Caneta c2 = new Caneta("Pilot", "Verde", 1.0f);
        
        c1.status();
        c2.status();
    }  
}