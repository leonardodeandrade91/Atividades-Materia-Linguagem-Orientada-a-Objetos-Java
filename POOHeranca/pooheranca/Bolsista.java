package pooheranca;

public class Bolsista extends Aluno {
    private float bolsa;
    
    public void renovarBolsa() {
        System.out.println("Bolsa Renovada!");
    }
    
    @Override
    public void pagarMensal() {
        System.out.println(this.nome + " é bolsista, então paga com desconto!");
    }

    @Override
    public String toString() {
        return "Bolsista{" + super.toString() + "bolsa=" + bolsa + '}';
    }
    
    public float getBolsa() {
        return this.bolsa;
    }
    
    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
