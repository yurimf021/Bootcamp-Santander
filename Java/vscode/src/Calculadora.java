import java.util.Scanner;

public class Calculadora {
    public static void main (String[] args){
    var scanner = new Scanner(System.in);
    System.out.println("Informe o primeiro número:");
    var value1 = scanner.nextInt();
    System.out.println("Informe o segundo número:");
    var value2 = scanner.nextInt();
    System.out.printf("O resultado da soma entre %s e %s é: %s\n", value1,value2,value1 + value2);
    System.out.printf("O resultado da subtração entre %s e %s é: %s\n", value1,value2,value1 - value2);
    System.out.printf("O resultado da multiplicação entre %s e %s é: %s\n", value1,value2,value1 * value2);
    System.out.printf("O resultado da divisão entre %s e %s é: %s3\n", value1,value2,value1 / value2);
    scanner.close();
    }
}

