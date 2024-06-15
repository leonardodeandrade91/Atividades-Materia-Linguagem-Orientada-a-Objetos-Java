package praticapoo1;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual() {
        System.out.println("-----------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        
        if(t.equals("CC")) {
            this.setSaldo(50);
        }
        else if(t.equals("CP")) {
            this.setSaldo(150);
        }
        
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta() {
        if(this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada porque ainda tem dinheiro!");
        }
        else if(this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada pois tem débito!");
        }
        else {
            this.setStatus(false);
            System.out.println("Conta de " + this.getDono() + " fechada com sucesso!");
        }
    }
    
    public void depositar(float v) {
        if(this.getStatus() == true) {
            this.setSaldo(this.getSaldo() + v);
            
            System.out.println("Depósito de R$" + v + " realizado na conta de " + this.getDono() + "!");
        }
        else {
            System.out.println("Conta fechada ou inexistente!");
        }
    }
    
    public void sacar(float v) {
        if(this.getStatus() == true) {
            if(this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                
                System.out.println("Saque de R$" + v + " realizado na conta de " + this.getDono() + "!");
            }
            else {
                System.out.println("Saldo insuficiente para saque!");
            }
        }
        else {
            System.out.println("Conta fechada! Impossível sacar!");
        }
    }
    
    public void pagarMensal() {
        int v = 0;
        
        if(this.getTipo().equals("CC")) {
            v = 12;
        }
        else if(this.getTipo().equals("CP")) {
            v = 20;
        }
        
        if(this.getStatus() == true) {
            this.setSaldo(this.getSaldo() - v);
            
            System.out.println("Mensalidade de R$" + v + " debitada da conta de " + this.getDono() + ".");
        }
        else {
            System.out.println("Não podemos cobrar, problemas na conta!");
        }
    }
    
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }
    
    public int getNumConta() {
        return this.numConta;
    }
    
    public String getTipo() {
        return this.tipo;
    }
    
    public String getDono() {
        return this.dono;
    }
    
    public float getSaldo() {
        return this.saldo;
    }
    
    public boolean getStatus() {
        return this.status;
    }
    
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void setDono(String dono) {
        this.dono = dono;
    }
    
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }
}