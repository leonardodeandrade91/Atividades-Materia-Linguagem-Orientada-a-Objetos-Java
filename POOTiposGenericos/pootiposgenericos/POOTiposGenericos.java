package pootiposgenericos;

public class POOTiposGenericos {
    public static void main(String[] args) {
        Generico<String> texto = new Generico<>();
        
        texto.setEntidade("Exemplo de String!");
        
        System.out.println(texto.getEntidade());
        
        Generico<Integer> numero = new Generico<>();
        
        numero.setEntidade(50);
        
        System.out.println(numero.getEntidade());
    }   
}