package principal;

import java.util.Scanner;
import model.bean.Categoria;
import model.bean.Produto;
import model.dao.CategoriaDAO;
import model.dao.ProdutoDAO;

public class Principal {
    public static void main(String args[]) {
        Scanner entr = new Scanner(System.in);
        
        char opc;
        
        int numCate;
        String descricao;
        int qtd;
        double valor;
        
        Produto prod = new Produto();
        ProdutoDAO pdao = new ProdutoDAO();
        Categoria cate = new Categoria();
        CategoriaDAO cdao = new CategoriaDAO();
        
        System.out.println("Produtos:");
        
        for(Produto p: pdao.findAll()) {
            System.out.printf("Descrição: %s - Valor: R$%.2f - Categoria: %s.\n", p.getDescricao(), p.getValor(), p.getCate().getDescricao());
        }
        
        System.out.println("\nCategorias:");
        
        for(Categoria c: cdao.findAll()) {
            System.out.printf("Descrição: %s - ID: %d.\n", c.getDescricao(), c.getId());
        }
        
        cdao = new CategoriaDAO();
        
        System.out.print("\nDeseja adicionar nova categoria? [S/N] ");
        opc = entr.next().trim().toCharArray()[0];
        
        if(Character.toUpperCase(opc) == 'S') {
            String desc;
            
            System.out.print("Digite o nome da categoria: ");
            entr.nextLine();
            desc = entr.nextLine().trim();
            
            cate.setDescricao(desc);
            
            if(cdao.save(cate)) {
                System.out.println("\nSalvo com Sucesso!\n");
            }
            else {
                System.err.println("\nErro ao Salvar!\n");
            }
        }
        
        pdao = new ProdutoDAO();
        cate = new Categoria();
        
        System.out.print("Digite o nome do produto: ");
        if(Character.toUpperCase(opc) != 'S') {
            entr.nextLine();
        }
        descricao = entr.nextLine().trim();
        System.out.print("Digite a quantidade: ");
        qtd = entr.nextInt();
        System.out.print("Digite o valor: ");
        valor = entr.nextDouble();
        System.out.print("Digite o número da categoria: ");
        numCate = entr.nextInt();
        
        cate.setId(numCate);
        
        prod.setDescricao(descricao);
        prod.setQtd(qtd);
        prod.setValor(valor);
        prod.setCate(cate);
        
        if(pdao.save(prod)) {
            System.out.println("\nSalvo com Sucesso!\n");
        }
        else {
            System.err.println("\nErro ao Salvar\n");
        }
        
        pdao = new ProdutoDAO();
        
        System.out.println("Produtos:");
        
        for(Produto p: pdao.findAll()) {
            System.out.printf("Descrição: %s - Valor: R$%.2f - Categoria: %s.\n", p.getDescricao(), p.getValor(), p.getCate().getDescricao());
        }
    }
}