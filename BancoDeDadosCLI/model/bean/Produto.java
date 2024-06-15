package model.bean;

public class Produto {
    private int id;
    private String descricao;
    private int qtd;
    private double valor;
    private Categoria cate;
    
    public Produto() {
        
    }
    
    public Produto(String descricao, int qtd, double valor, Categoria cate) {
        this.descricao = descricao;
        this.qtd = qtd;
        this.valor = valor;
        this.cate = cate;
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
    
    public double getValor() {
        return this.valor;
    }
    
    public Categoria getCate() {
        return this.cate;
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
    
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void setCate(Categoria cate) {
        this.cate = cate;
    }
}