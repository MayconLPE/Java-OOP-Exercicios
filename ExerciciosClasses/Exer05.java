import java.util.ArrayList;
import java.util.Scanner;

import model.ContaCorrente;

public class Exer05 {
    public static void main(String[] args) {

        int numConta;
        String nome;
        float saldo;
        boolean rodando = true;

        Scanner sc = new Scanner(System.in);
        ArrayList<ContaCorrente> cc = new ArrayList<ContaCorrente>();

        while (rodando) {
            System.out.println("1- Cadastrar Conta:");
            System.out.println("2- Alterar Nome da conta");
            System.out.println("3- Depósito");
            System.out.println("4- Saque");
            System.out.println("0- Sair");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:

                System.out.println("Digite seu número da conta:");
                numConta = sc.nextInt();
                sc.nextLine();
                System.out.println("Digite o nome:");
                nome = sc.nextLine();
        
                ContaCorrente ccl = new ContaCorrente(opcao, nome, saldo = 0.0f);
                ccl.setNumConta(numConta);
                ccl.setNome(nome);
                ccl.setSaldo(saldo);
                cc.add(ccl);
                
                for (int i = 0; i < cc.size(); i++) {
                    numConta = cc.get(i).getNumConta();
                    nome = cc.get(i).getNome();
                    System.out.println("Nome: " + nome + " | Número da conta: " + numConta + " | Saldo: R$ " + saldo);   
                }
                
                    break;
                case 2:
                System.out.println("Alterar nome");
                    break;
                case 3:
                System.out.println("Depósito");
                    System.out.println("Digite a quantia do deposito:");
                    
                    break;
                case 4:
                System.out.println("Saque");
                    break;
                case 0:
                rodando = false;
                System.out.println("Saindo...");
                    break;
            
                default:
                    break;
            }
            
        }
        
        sc.close();
    }
    
}