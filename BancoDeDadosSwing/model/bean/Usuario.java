package model.bean;

public class Usuario {
    private int id;
    private String login;
    private String senha;
    
    public int getId() {
        return this.id;
    }
    
    public String getLogin() {
        return this.login;
    }
    
    public String getSenha() {
        return this.senha;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
}