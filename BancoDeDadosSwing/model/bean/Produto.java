package model.bean;

public class Produto {
    private int id;
    private String descricao;
    private int qtd;
    private double preco;
    
    @Override
    public String toString() {
        return this.getDescricao();
    }
    
    public int getId() {
        return this.id;
    }
    
    public String getDescricao() {
        return this.descricao;
    }
    
    public int getQtd() {
        return this.qtd;
    }
    
    public double getPreco() {
        return this.preco;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
}