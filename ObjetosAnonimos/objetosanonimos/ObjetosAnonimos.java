package objetosanonimos;

public class ObjetosAnonimos {
    @FunctionalInterface
    public interface Bicho {
        public void emitirSom();
    }
    
    public static class Cachorro implements Bicho {
        @Override
        public void emitirSom() {
            System.out.println("Au! Au! Au!");
        }
    }
    
    public static void main(String[] args) {
        Bicho gato = () -> System.out.println("Miau!");
        
        gato.emitirSom();
    } 
}