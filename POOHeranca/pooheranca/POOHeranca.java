package pooheranca;

public class POOHeranca {
    public static void main(String[] args) {
        Bolsista b1 = new Bolsista();
        
        b1.setNome("Jubileu");
        b1.setIdade(17);
        b1.setSexo("M");
        b1.setMatr(1112);
        b1.setCurso("Administrador");
        b1.setBolsa(12.5f);
        
        b1.pagarMensal();
        b1.renovarBolsa();
        
        System.out.println(b1.toString());
    } 
}