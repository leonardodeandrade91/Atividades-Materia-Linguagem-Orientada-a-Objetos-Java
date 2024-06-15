package lambdasemjava;

public class LambdasEmJava {
    @FunctionalInterface
    public interface Num {
        public double getValue();
    }
    
    @FunctionalInterface
    public interface ValorNumeric {
        public boolean verif(int n);
    }
    
    @FunctionalInterface
    public interface Valores {
        public boolean divisao(int n1, int n2);
    }
    
    public static void main(String[] args) {
        Num n1 = () -> 333.11;
        Num n2 = () -> Math.random() * 100;
        
        System.out.println(n1.getValue());
        System.out.println(n2.getValue());
        System.out.println(n2.getValue());
        
        ValorNumeric isPar = (num) -> num % 2 == 0;
        
        System.out.println(isPar.verif(89));
        System.out.println(isPar.verif(90));
        
        Valores isDiv = (x, y) -> x % y == 0;
        
        System.out.println(isDiv.divisao(10, 2));
        System.out.println(isDiv.divisao(10, 3));
        
        Valores expressao = (x, y) -> {
            int w = x + y;
            
            return w > 1000;
        };
        
        System.out.println(expressao.divisao(2000, 2));
    } 
}