import java.util.Scanner;

public class Oldest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a idade da primeira pessoa :");
        int age1 = scanner.nextInt();
        System.out.println("Digite a idade da segunda pessoa :");
        int age2 = scanner.nextInt();
        int diferance;
        if (age1 > age2) {
            diferance = age1 - age2;
            System.out.printf("A diferença entre as idade é de :%d", diferance);
        } else {
            diferance = age2 - age1;
            System.out.printf("A diferença entre as idade é de :%d", diferance);
        }
        scanner.close();
    }
}
