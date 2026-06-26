import java.util.Scanner;
public class Impar {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        var num1 = scanner.nextInt();
        System.out.println("Digite o segundo número:"); 
        var num2 = scanner.nextInt();
        System.out.println("Você quer saber quais são os numeros ímpares ou pares?(impar/par)");
        var escolha  = scanner.next();
        if(escolha .equalsIgnoreCase("impar")){
            for(int i = num1; i <= num2; i++){
                if(i % 2 != 0){
                    System.out.println(i);
                }
            }
        }
        if(escolha .equalsIgnoreCase("par")){
            for(int i = num1; i <= num2; i++){
                if(i % 2 == 0){
                    System.out.println(i);
                }
            }
        }
        
        
    scanner.close();
    }
    
}
