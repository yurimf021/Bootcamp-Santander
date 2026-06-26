public class Carro {
    // Atributos (Características)
    String modelo;
    String cor;
    int ano;
    boolean ligado;

    // Método (Ação): Ligar o carro
    public void ligar() {
        ligado = true;
        System.out.println("O " + modelo + " está ligado! Vrum vrum!");
    }

    // Método (Ação): Mostrar informações
    public void exibirFichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
    }
}