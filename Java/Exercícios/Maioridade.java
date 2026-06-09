import java.util.Scanner;
public class Maioridade {
    public static void main (String[]args){
        var scanner = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        var nome = scanner.next();
        System.out.println("Digite sua idade:");
        var idade = scanner.nextInt();
        if(idade >= 18){
            System.out.printf("%s,  você é maior de idade!\n", nome);
        } else {
            System.out.printf("%s,  você não é maior de idade.\n", nome);
        }
        scanner.close();
    }
}
