package praticapoo3;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected float experiencia;

    @Override
    public String toString() {
        return "Pessoa:" + "\nNome = " + nome + "\nIdade = " + idade + "\nSexo = " + sexo + "\nExperiencia = " + experiencia;
    }
    
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
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
    
    public float getExperiencia() {
        return this.experiencia;
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
    
    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }
}