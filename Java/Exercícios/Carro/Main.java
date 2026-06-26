import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        int continuar = 0;
        int opcao;
                
        Scanner entrada = new Scanner(System.in);
        
        while(continuar == 0) {
            System.out.println("\n========== Bem-vindo ao teu carro! =========="); 
            System.out.println("(1) Ligar carro");
            System.out.println("(2) Desligar carro");
            System.out.println("(3) Acelerar");
            System.out.println("(4) Diminuir velocidade");
            System.out.println("(5) Curvar para direita/esquerda");
            System.out.println("(6) Verificar velocidade");
            System.out.println("(7) Trocar a marcha");
            System.out.println("(0) Sair do carro");

            System.out.print("Escolhe uma opção: ");
            opcao = entrada.nextInt();
            
            switch(opcao) {
                case 1:
                    meuCarro.Ligar();
                    break;
                case 2:
                    meuCarro.Desligar();
                    break;
                case 3:
                    meuCarro.Acelerar();
                    break;
                case 4:
                    meuCarro.DiminuirVelocidade();
                    break;
                case 5:
                    System.out.println("Para qual lado desejas realizar a curva?");
                    entrada.nextLine();
                    String lado = entrada.nextLine();
                    meuCarro.Curva(lado);
                    break;
                case 6:
                    meuCarro.VerificarVelocidade();
                    break;
                case 7:
                    System.out.println("Digita 1 para SUBIR a marcha ou 2 para REDUZIR a marcha:");
                    int acaoMarcha = entrada.nextInt();
                    meuCarro.TrocarMarcha(acaoMarcha);
                    break;
                case 0:
                    System.out.println("Saíste do carro. Até logo!");
                    continuar = 1;
                    break;
                default:
                    System.out.println("Opção inválida! Tenta novamente.");
            }
        } 

        entrada.close();
    }
}