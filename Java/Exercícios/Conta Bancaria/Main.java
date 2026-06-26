import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=== ABERTURA DE CONTA ===");
        System.out.print("Digite o valor do depósito inicial: R$ ");
        double depositoInicial = teclado.nextDouble();

        ContaBancaria conta = new ContaBancaria(depositoInicial);
        System.out.println("Conta aberta com sucesso!\n");

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n=== MENU DE OPERAÇÕES ===");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Consultar Cheque Especial");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Pagar Boleto");
            System.out.println("6 - Verificar uso do Cheque Especial");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = teclado.nextInt();
            System.out.println("--------------------------------");

            switch (opcao) {
                case 1:
                    conta.consultarSaldo();
                    break;
                case 2:
                    conta.consultarChequeEspecial();
                    break;
                case 3:
                    System.out.print("Digite o valor do depósito: R$ ");
                    double valorDep = teclado.nextDouble();
                    conta.depositar(valorDep);
                    break;
                case 4:
                    System.out.print("Digite o valor do saque: R$ ");
                    double valorSaq = teclado.nextDouble();
                    conta.sacar(valorSaq);
                    break;
                case 5:
                    System.out.print("Digite o valor do boleto: R$ ");
                    double valorBol = teclado.nextDouble();
                    conta.pagarBoleto(valorBol);
                    break;
                case 6:
                    conta.verificarChequeEspecial();
                    break;
                case 0:
                    System.out.println("Encerrando o sistema. Obrigado por usar nosso banco!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        // Fechando o recurso para evitar o "Resource leak" que o VS Code avisou
        teclado.close(); 
    }
}