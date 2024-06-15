package praticapoo3;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;
    
    public void avaliar() {
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }
    
    public void avaliar(float porc) {
        int nova = 0;
        
        if(porc <= 20) {
            nova = 3;
        }
        else if(porc > 20 && porc <= 50) {
            nova = 5;
        }
        else if(porc > 50 && porc <= 90) {
            nova = 8;
        }
        else {
            nova = 10;
        }
        
        this.filme.setAvaliacao(nova);
    }

    @Override
    public String toString() {
        return "Visualizacao:\n" + "Espectador = " + espectador + "\nFilme = " + filme + "\n";
    }
    
    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.filme.setViews(this.filme.getViews() + 1);
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
    }
    
    public Gafanhoto getEspectador() {
        return this.espectador;
    }
    
    public Video getFilme() {
        return this.filme;
    }
    
    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }
    
    public void setFilme(Video filme) {
        this.filme = filme;
    }
}