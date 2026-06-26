import java.util.Scanner;

public class Divisíveis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número inicial: ");
        int primeiro = sc.nextInt();

        int numero;

        do {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();

            if (numero < primeiro) {
                System.out.println("Número ignorado.");
                continue;
            }

        } while (numero % primeiro == 0);

        System.out.println("Programa encerrado. "
                + numero + " não é múltiplo de " + primeiro);

        sc.close();
    }
}