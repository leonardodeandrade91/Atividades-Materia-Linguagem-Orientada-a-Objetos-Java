package lambdasparte2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdasParte2 {
    public static void main(String[] args) {
        List<String> lista1 = Arrays.asList("SC", "PR", "SP", "RJ", "DF", "CE");
        
        System.out.println("Estados que começam com \"S\": ");
        
        filtro(lista1, (s) -> s.startsWith("S"));
        
        System.out.println("Estados que terminam com \"E\": ");
        
        filtro(lista1, (s) -> s.endsWith("E"));
        
        System.out.println("Todos os estados: ");
        
        filtro(lista1, (s) -> true);
        
        System.out.println("Nenhum estado: ");
        
        filtro(lista1, (s) -> false);
    }
    
    public static void filtro(List<String> lista, Predicate<String> cond) {
        lista.stream().filter(cond::test).forEach(System.out::println);
    }
}