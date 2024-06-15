package pooheranca;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    
    public void fazerAniver() {
        this.idade++;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public String getSexo() {
        return this.sexo;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}