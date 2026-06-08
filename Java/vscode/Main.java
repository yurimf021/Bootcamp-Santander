import java.util.Scanner;
public class Main{
public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Olá, informe o seu nome:");
    String name = scanner.next();
    System.out.println("Informe a sua idade:");
    int age = scanner.nextInt();
    System.out.println("Olá, " + name + ", sua idade é " + age + "!");
    scanner.close();
    }
}
