package model.bean;

import java.util.Date;

public class Urna {
    private int id;
    private Date datahora;
    private Candidato cand;
    private Eleitor elei;
    private int voto;
    
    public int getId() {
        return this.id;
    }
    
    public Date getDataHora() {
        return this.datahora;
    }
    
    public Candidato getCand() {
        return this.cand;
    }
    
    public Eleitor getElei() {
        return this.elei;
    }
    
    public int getVoto() {
        return this.voto;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setDataHora(Date datahora) {
        this.datahora = datahora;
    }
    
    public void setCand(Candidato cand) {
        this.cand = cand;
    }
    
    public void setElei(Eleitor elei) {
        this.elei = elei;
    }
    
    public void setVoto(int voto) {
        this.voto = voto;
    }
}