package classes;

public class ContaBanco {
    private String nome;
    private String sobrenome;
    private long cpf;
    private float saldo;
    
    public void depositar(float valor) {
        this.saldo += valor;
    }
    
    public boolean sacar(double valor) {
        if(valor <= this.saldo) {
            this.saldo -= valor;
            
            return true;
        }
        else {
            return false;
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public long getCpf() {
        return this.cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}