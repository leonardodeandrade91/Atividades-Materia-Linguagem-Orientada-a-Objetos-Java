package praticapooest;

public class Ventilador {
    private static boolean ligado = false;
    private static int velocidade = 0;
    
    public static void ligar(int vel) {
        ligado = true;
        
        if(vel < 1) {
            vel = 1;
        }
        else if(vel > 3) {
            vel = 3;
        }
        
        velocidade = vel;
        
        System.out.printf("O ventilado está ligado, na velocidade de %d.\n", velocidade);
    }
    
    public static void desligar() {
        velocidade = 0;
        ligado = false;
        
        System.out.println("O ventilador está desligado!");
    }
    
    public static boolean getLigado() {
        return ligado;
    }
    
    public static int getVelocidade() {
        return velocidade;
    }
    
    public static void setLigado(boolean ligado){
        Ventilador.ligado = ligado;
    }
    
    public static void setVelocidade(int velocidade) {
        Ventilador.velocidade = velocidade;
    }
}