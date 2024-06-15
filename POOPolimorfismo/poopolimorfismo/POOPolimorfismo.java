package poopolimorfismo;

public class POOPolimorfismo {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        
        c.reagir("Olá");
        c.reagir("Vai Apanhar");
        
        c.reagir(11, 45);
        c.reagir(20, 00);
        
        c.reagir(true);
        c.reagir(false);
        
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
    }
}