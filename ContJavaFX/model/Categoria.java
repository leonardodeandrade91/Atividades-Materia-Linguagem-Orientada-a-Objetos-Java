package model;

public class Categoria {
    private int id;
    private String nome;
    
    @Override
    public String toString() {
        return this.getNome();
    }
    
    public Categoria(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
    public int getId() {
        return this.id;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
}