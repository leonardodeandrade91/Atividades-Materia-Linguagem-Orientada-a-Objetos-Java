package pooestaticos;

public class Lampada {
    public static float preco = 9.50f;
    private static boolean acesa = false;
    
    public static void custo() {
        System.out.printf("A lâmpada custa R$ %.2f.\n", preco);
    }
    
    public static void acender() {
        System.out.println("A lâmpada está acesa!");
        acesa = true;
    }
    
    public static void apagar() {
        System.out.println("A lâmpada está apagada!");
        acesa = false;
    }
}