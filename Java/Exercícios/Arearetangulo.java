import java.util.Scanner;
public class Arearetangulo {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a base do retângulo:");
        double base = scanner.nextDouble();
        System.out.print("Digite a altura do retângulo:");
        double altura = scanner.nextDouble();
        System.out.printf("A área do retângulo é: %.2f", base * altura);
        scanner.close();
    }
}
