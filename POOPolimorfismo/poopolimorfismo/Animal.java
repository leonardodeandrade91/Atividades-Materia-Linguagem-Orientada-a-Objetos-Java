package poopolimorfismo;

public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int membros;
    
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
    
    public float getPeso() {
        return this.peso;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public int getMembros() {
        return this.membros;
    }
    
    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void setMembros(int membros) {
        this.membros = membros;
    }
}