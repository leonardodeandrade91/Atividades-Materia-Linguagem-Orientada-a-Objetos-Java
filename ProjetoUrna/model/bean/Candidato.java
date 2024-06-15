package model.bean;

public class Candidato {
    private int id;
    private String nome;
    private int numero;
    private Partido part;
    
    public int getId() {
        return this.id;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public int getNumero() {
        return this.numero;
    }
    
    public Partido getPart() {
        return this.part;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void setPart(Partido part) {
        this.part = part;
    }
}