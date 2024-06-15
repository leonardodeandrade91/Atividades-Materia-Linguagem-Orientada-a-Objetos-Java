package pooheranca;

public class Aluno extends Pessoa {
    private int matr;
    private String curso;
    
    public void cancelarMatr() {
        System.out.println("Matrícula será cancelada!");
    }
    
    public void pagarMensal() {
        System.out.println("Pagando mensalidade do aluno " + this.nome + ".");
    }

    @Override
    public String toString() {
        return "Aluno{" + super.toString() + "matr=" + matr + ", curso=" + curso + '}';
    }
    
    public int getMatr() {
        return this.matr;
    }
    
    public String getCurso(){
        return this.curso;
    }
    
    public void setMatr(int matr) {
        this.matr = matr;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
}