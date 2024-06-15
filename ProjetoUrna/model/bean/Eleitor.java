package model.bean;

public class Eleitor {
    private int id;
    private String nome;
    private String cpf;
    private String cep;
    private String rua;
    private String bairro;
    private int numero;
    
    public int getId() {
        return this.id;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public String getCpf() {
        return this.cpf;
    }
    
    public String getCep() {
        return this.cep;
    }
    
    public String getRua() {
        return this.rua;
    }
    
    public String getBairro() {
        return this.bairro;
    }
    
    public int getNumero() {
        return this.numero;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void setCep(String cep) {
        this.cep = cep;
    }
    
    public void setRua(String rua) {
        this.rua = rua;
    }
    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
}