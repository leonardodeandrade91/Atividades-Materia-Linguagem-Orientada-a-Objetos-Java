package compljava;

public class Fatorial {
    private int num = 0;
    private int fat = 1;
    private String form = "";
    
    public void setValor(int n) {
        num = n;
        int f = 1;
        String s = "";
        
        for(int cont = n; cont > 1; cont--) {
            f *= cont;
            s += cont + " x ";
        }
        
        s += "1 = ";
        fat = f;
        form = s;
    }
    
    public int getFatorial() {
        return fat;
    }
    
    public String getFormula() {
        return form;
    }
}