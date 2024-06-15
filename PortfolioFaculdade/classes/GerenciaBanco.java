package classes;

import java.util.Scanner;

public class GerenciaBanco {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in, "CP1252");
        ContaBanco conta = new ContaBanco();
        
        String nome, sobrenome;
        long cpf;
        int opcao;
        float valor;
        
        System.out.println("Bem-vindo ao Banco Java!");
        
        System.out.print("Digite seu Nome: ");
        nome = entrada.nextLine().trim();
        System.out.print("Digite seu Sobrenome: ");
        sobrenome = entrada.nextLine().trim();
        System.out.print("Digite seu CPF: ");
        cpf = Long.parseLong(entrada.nextLine().replace(".", "").replace("-", "").trim());
        
        conta.setNome(nome);
        conta.setSobrenome(sobrenome);
        conta.setCpf(cpf);
        
        do {
            System.out.println("\nEscolha uma Opção!\n");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Realizar Depósito");
            System.out.println("3 - Realizar Saque");
            System.out.println("4 - Encerrar\n");
            System.out.print("Opção Escolhida: ");
            opcao = entrada.nextInt();
            
            System.out.println("");
            
            switch(opcao) {
                case 1:
                    System.out.printf("Seu Saldo Atual é de R$%.2f.\n", conta.getSaldo());
                    break;
                case 2:
                    System.out.print("Digite o Valor a ser Depositado: ");
                    valor = entrada.nextFloat();
                    conta.depositar(valor);
                    System.out.printf("\nDepósito de R$%.2f Realizado com Sucesso!\n", valor);
                    break;
                case 3:
                    System.out.print("Digite o Valor a ser Sacado: ");
                    valor = entrada.nextFloat();
                    
                    if(conta.sacar(valor)) {
                        System.out.printf("\nSaque de R$%.2f Realizado com Sucesso!\n", valor);
                    }
                    else {
                        System.out.println("\nSaldo Insuficiente para Saque!");
                    }
                    break;
                case 4:
                    System.out.println("Obrigado por Utilizar nosso Banco!");
                    break;
                default:
                    System.out.println("Opção Inválida! Tente Novamente!");
                    break;
            }
        }
        while(opcao != 4);
    }
}