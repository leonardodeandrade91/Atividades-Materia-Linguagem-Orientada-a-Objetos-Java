package poopolimorfismo;

public class Peixe extends Animal {
    private String corEscama;
    
    @Override
    public void locomover() {
        System.out.println("Nadando!");
    }
    
    @Override
    public void alimentar() {
        System.out.println("Comendo Substâncias!");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz Som!");
    }
    
    public String getCorEscama() {
        return this.corEscama;
    }
    
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}