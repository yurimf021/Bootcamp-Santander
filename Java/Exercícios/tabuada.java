import java.util.Scanner;
public class tabuada {
    public static void main(String[]args){
        var scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = scanner.nextInt();
        for(int i =1;i<=10;i++){
            System.out.println(numero + "x" +i+ "=" + (numero*i));
        } 
    scanner.close();
    }

}