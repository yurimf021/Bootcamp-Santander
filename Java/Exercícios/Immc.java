import java.util.Scanner;
public class Immc {
    public static void main(String []args){
        var scanner = new Scanner(System.in);
        System.out.println("Digite sua altura:");
        var altura = scanner.nextDouble();
        System.out.println("Digite seu peso:");
        var peso = scanner.nextDouble();
        var imc = peso / (altura * altura);
        if(imc < 18.5){
            System.out.println("Você está com o peso ideal, bora treinar!");
        }if(imc >= 18.6 && imc < 24.9){
            System.out.println("Você está um pouco acima do peso, bora treinar!");
        }if(imc >=25 && imc<= 29.9){
            System.out.println("Voce está acima do peso, bora treinar e melhorar a alimentação!");
        }if(imc >=30 && imc <= 34.9){
            System.out.println("Você está obeso(a), bora treinar, se alimentar melhor e procurar ajuda de profissionais!");
        }if(imc >=35 && imc <= 39.9){
            System.out.println("ATENÇÃO:Você está com obesidade severa, bora treinar, se alimentar melhor e procurar ajuda de profissionais!");
        }if(imc >40){
            System.out.println("ATENÇÃO:Você precisa procurar profissionais de saúde URGENTE!!!!");
        }
        scanner.close();
    }
}
