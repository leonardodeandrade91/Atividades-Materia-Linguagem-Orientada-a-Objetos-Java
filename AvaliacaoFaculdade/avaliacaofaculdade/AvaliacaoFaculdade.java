package avaliacaofaculdade;

public class AvaliacaoFaculdade {
    public static void main(String args[]) {
        int n = 10;
        int v[] = new int[n];
        int i;
        
        v[0] = 1025;
        v[1] = 547;
        v[2] = 415;
        v[3] = 497;
        v[4] = 8877;
        v[5] = 13;
        v[6] = 4887;
        v[7] = 1267;
        v[8] = 5456;
        v[9] = 1781;
        
        int soma = 0;
        int menor = v[0];
        int maior = v[0];
        
        for(i = 0; i < n; i++) {
            soma = soma + v[i];
            
            if(v[i] < menor)
                menor = v[i];
            
            if(v[i] > maior)
                maior = v[i];
        }
        
        System.out.println("");
        
        for(i = 0; i < n; i++) {
            if(v[i] == menor)
                System.out.printf("v[%d] = %2d <--- menor valor.\n", i, v[i]);
            else if(v[i] == maior)
                System.out.printf("v[%d] = %2d <--- maior valor.\n", i, v[i]);
            else
                System.out.printf("v[%d] = %2d\n", i, v[i]);
        }
        
        System.out.printf("\nSoma = %d\n", soma);
    }
}