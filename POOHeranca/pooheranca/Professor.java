package pooheranca;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;
    
    public void receberAumento(float aum) {
        this.salario += aum;
    }
    
    public String getEspecialidade() {
        return this.especialidade;
    }
    
    public float getSalario() {
        return this.salario;
    }
    
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    public void setSalario(float salario) {
        this.salario = salario;
    }
}