package compljava;

public class ComplJava {
    enum Dados {
        pito(1), duque(2), terno(3), quadra(4), quina(5), sena(6);
        public int valor;
        
        Dados(int v) {
            valor = v;
        }
    }
    
    public static void main(String args[]) {
        for(Dados d: Dados.values()) {
            System.out.printf("%s: %d.\n", d, d.valor);
        }
    }
}