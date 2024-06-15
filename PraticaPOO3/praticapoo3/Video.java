package praticapoo3;

public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    
    @Override
    public void play() {
        this.reproduzindo = true;
    }
    
    @Override
    public void pause() {
        this.reproduzindo = false;
    }
    
    @Override
    public void like() {
        this.curtidas++;
    }
    
    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    @Override
    public String toString() {
        return "Video:" + "\nTitulo = " + titulo + "\nAvaliacao = " + avaliacao + "\nViews = " + views + "\nCurtidas = " + curtidas + "\nReproduzindo = " + reproduzindo;
    }
    
    public String getTitulo() {
        return this.titulo;
    }
    
    public int getAvaliacao() {
        return this.avaliacao;
    }
    
    public int getViews() {
        return this.views;
    }
    
    public int getCurtidas() {
        return this.curtidas;
    }
    
    public boolean getReproduzindo() {
        return this.reproduzindo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setAvaliacao(int avaliacao) {
        int media;
        media = (int)(this.avaliacao + avaliacao) / this.views;
        this.avaliacao = media;
    }
    
    public void setViews(int views) {
        this.views = views;
    }
    
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
}