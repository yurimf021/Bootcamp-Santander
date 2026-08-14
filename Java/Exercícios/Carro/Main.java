import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        int continuar = 0;
        int opcao;
                
        Scanner entrada = new Scanner(System.in);

            System.out.println("\n========== Bem-vindo(a) ao seu carro! ==========");

        while(continuar == 0) { 
            
            System.out.println("(1) Ligar carro");
            System.out.println("(2) Desligar carro");
            System.out.println("(3) Acelerar");
            System.out.println("(4) Diminuir velocidade");
            System.out.println("(5) Curvar ");
            System.out.println("(6) Verificar velocidade");
            System.out.println("(7) Trocar a marcha");
            System.out.println("(0) Sair do carro");

            System.out.println("Escolha uma opção: ");
            opcao = entrada.nextInt();
            
            switch(opcao) {
                case 1:
                    System.out.println("\n");
                    meuCarro.Ligar();
                    break;
                case 2:
                    System.out.println("\n");
                    meuCarro.Desligar();
                    break;
                case 3:
                    System.out.println("\n");
                    meuCarro.Acelerar();
                    break;
                case 4:
                    System.out.println("\n");                    
                    meuCarro.DiminuirVelocidade();
                    break;
                case 5:
                    System.out.println("\nPara qual lado desejas realizar a curva?");
                    entrada.nextLine();
                    String lado = entrada.nextLine();
                    meuCarro.Curva(lado);
                    break;
                case 6:
                    System.out.println("\n");
                    meuCarro.VerificarVelocidade();
                    break;
                case 7:
                    System.out.println("\nDigite 1 para SUBIR a marcha ou 2 para REDUZIR a marcha:");
                    int acaoMarcha = entrada.nextInt();
                    meuCarro.TrocarMarcha(acaoMarcha);
                    break;
                case 0:
                    System.out.println("\n");
                    meuCarro.Sair();
                    break;
                default:
                    System.out.println("\nOpção inválida! Tenta novamente.");
            }       System.out.println("\n");  
        } 

        entrada.close();
    }
}
