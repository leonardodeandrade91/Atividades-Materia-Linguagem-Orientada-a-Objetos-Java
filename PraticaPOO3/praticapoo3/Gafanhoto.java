package praticapoo3;

public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistido;
    
    public void assistirMaisUm() {
        this.totAssistido++;
    }

    @Override
    public String toString() {
        return "Gafanhoto:\n" + super.toString() + "\nLogin = " + login + "\nTotAssistido = " + totAssistido + "\n";
    }
    
    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    
    public String getLogin() {
        return this.login;
    }
    
    public int getTotAssistido() {
        return this.totAssistido;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    
    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
}