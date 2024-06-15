package praticapoo2;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    @Override
    public void detalhes(){
        System.out.println("Livro " + this.titulo + " escrito por " + this.autor + ".");
        
        if(this.aberto == true) {
            System.out.println("O livro está aberto!");
            System.out.println("Páginas: " + this.totPaginas + ", página atual: " + this.pagAtual + ".");
            System.out.println("Sendo lido por " + this.leitor.getNome() + ".");
            System.out.println("De idade de " + this.leitor.getIdade() + " anos.");
            System.out.println("E de sexo " + this.leitor.getSexo() + ".");
        }
        else {
            System.out.println("O livro está fechado no momento!");
        }
    }
    
    @Override
    public void abrir() {
        this.aberto = true;
    }
    
    @Override
    public void fechar() {
        this.aberto = false;
    }
    
    @Override
    public void folhear(int p) {
        if(this.getAberto() == true) {
            if(p > this.totPaginas) {
                this.setPagAtual(this.getTotPaginas());
            }
            else if(p < 0) {
                this.setPagAtual(0);
            }
            else {
                this.pagAtual = p;
            }
        }
    }
    
    @Override
    public void avancarPag() {
        if(this.getAberto() == true) {
            if(this.getPagAtual() < this.getTotPaginas()) {
                this.setPagAtual(this.getPagAtual() + 1);
            }
        }
    }
    
    @Override
    public void voltarPag() {
        if(this.getAberto() == true) {
            if(this.getPagAtual() > 0) {
                this.setPagAtual(this.getPagAtual() - 1);
            }
        }
    }
    
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.pagAtual = 0;
        this.aberto = false;
    }
    
    public String getTitulo() {
        return this.titulo;
    }
    
    public String getAutor() {
        return this.autor;
    }
    
    public int getTotPaginas() {
        return this.totPaginas;
    }
    
    public int getPagAtual() {
        return this.pagAtual;
    }
    
    public boolean getAberto() {
        return this.aberto;
    }
    
    public Pessoa getLeitor() {
        return this.leitor;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }
    
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
    
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
}