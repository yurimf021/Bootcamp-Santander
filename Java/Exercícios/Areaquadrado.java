import java.util.Scanner;
public class Areaquadrado {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o lado do 2quadrado:");
        double lado = scanner.nextDouble();
        System.out.printf("A área do quadrado é: %.2f", lado * lado);
        scanner.close();
    }
}
