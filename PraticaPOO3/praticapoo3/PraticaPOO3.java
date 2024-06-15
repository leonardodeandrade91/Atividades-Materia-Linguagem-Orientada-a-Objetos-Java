package praticapoo3;

import java.util.List;
import java.util.ArrayList;

public class PraticaPOO3 {
    public static void main(String[] args) {
        List<Video> v = new ArrayList<>();
        
        v.add(new Video("Aula 1 de POO"));
        v.add(new Video("Aula 12 de Java"));
        v.add(new Video("Aula 15 de HTML5"));
                
        List<Gafanhoto> g = new ArrayList<>();
        
        g.add(new Gafanhoto("Jubileu", 22, "M", "Jubi"));
        g.add(new Gafanhoto("Creuza", 12, "F", "Creuzita"));
                
        List<Visualizacao> vis = new ArrayList<>();
        
        vis.add(new Visualizacao(g.get(0), v.get(2)));
        
        System.out.println(vis.get(0).toString());
        
        vis.add(new Visualizacao(g.get(0), v.get(1)));
        
        System.out.println(vis.get(1).toString());
        
        vis.get(0).avaliar();
        vis.get(1).avaliar(85.0f);
        
        System.out.println(vis.get(0).toString());
        System.out.println(vis.get(1).toString());
    }
}