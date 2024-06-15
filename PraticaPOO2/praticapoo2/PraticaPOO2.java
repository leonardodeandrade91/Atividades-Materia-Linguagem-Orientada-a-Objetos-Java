package praticapoo2;

public class PraticaPOO2 {
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[2];
        Publicacao l[] = new Publicacao[3];
        
        p[0] = new Pessoa("Sérgio", 22, "M");
        p[1] = new Pessoa("Maria", 31, "F");
        
        l[0] = new Livro("Java Básico", "José da Silva", 300, p[0]);
        l[1] = new Livro("POO com Java", "Maria de Souza", 500, p[0]);
        l[2] = new Livro("Java Avançado", "Ana Paula", 800, p[1]);
        
        l[2].abrir();
        l[2].folhear(305);
        l[2].avancarPag();
        l[2].detalhes();
    }
}