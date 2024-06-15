package compljava;

public class Operacoes {
    public static String contador(int ini, int fim) {
        String stri = "";
        
        for(int cont = ini; cont <= fim; cont++) {
            stri += cont + " ";
        }
        
        return stri;
    }
}
