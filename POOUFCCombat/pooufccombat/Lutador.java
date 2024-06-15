package pooufccombat;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    public void apresentar() {
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.print("CHEGOU A HORA! O lutador " + this.getNome());
        System.out.print(" veio diretamente de " + this.getNacionalidade());
        System.out.println(", tem " + this.getIdade() + " anos e pesa " + this.getPeso() + "kg.");
        System.out.print("Ele tem " + this.getVitorias() + " vitórias, ");
        System.out.println(this.getDerrotas() + " derrotas e " + this.getEmpates() + " empates.");
    }
    
    public void status() {
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.print(this.getNome() + " é um peso " + this.getCategoria());
        System.out.print(" e já ganhou " + this.getVitorias() + " vezes, ");
        System.out.print("perdeu " + this.getDerrotas() + " vezes e ");
        System.out.println("empatou " + this.getEmpates() + " vezes.");
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
    
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public String getNacionalidade() {
        return this.nacionalidade;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public float getAltura() {
        return this.altura;
    }
    
    public float getPeso() {
        return this.peso;
    }
    
    public String getCategoria() {
        return this.categoria;
    }
    
    public int getVitorias() {
        return this.vitorias;
    }
    
    public int getDerrotas() {
        return this.derrotas;
    }
    
    public int getEmpates() {
        return this.empates;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    
    private void setCategoria() {
        if(this.peso <= 52.2) {
            this.categoria = "Inválido";
        }
        else if(this.peso > 52.2 && this.peso <= 70.3) {
            this.categoria = "Leve";
        }
        else if(this.peso > 70.3 && this.peso <= 83.9) {
            this.categoria = "Médio";
        }
        else if(this.peso > 83.9 && this.peso <= 120.2) {
            this.categoria = "Pesado";
        }
        else {
            this.categoria = "Inválido";
        }
    }
    
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    
    public void setEmpates(int empates) {
        this.empates = empates;
    }
}