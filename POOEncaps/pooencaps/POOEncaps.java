package pooencaps;

public class POOEncaps {
    public static void main(String[] args) {
        Controlador c = new ControleRemoto();
        
        if(c instanceof Controlador) {
            c.ligar();
            c.play();
            c.maisVolume();
            c.maisVolume();
            c.maisVolume();
            c.maisVolume();
            c.abrirMenu();
            c.fecharMenu();
        }
        else {
            System.err.println("O objeto não implementa a interface Controlador!");
        }
    } 
}