package poopolimorfismo;

public class Ave extends Animal {
    private String corPena;
    
    public void fazerNinho() {
        System.out.println("Construindo Ninho!");
    }
    
    @Override
    public void locomover() {
        System.out.println("Voando!");
    }
    
    @Override
    public void alimentar() {
        System.out.println("Comendo Frutas!");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Som de Ave!");
    }
    
    public String getCorPena() {
        return this.corPena;
    }
    
    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}