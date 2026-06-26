public class Main {
    public static void main(String[] args) {
        // Criando um objeto (Instanciando a classe)
        Carro meuCarro = new Carro();
        
        // Preenchendo os atributos
        meuCarro.modelo = "Fusca";
        meuCarro.cor = "Azul";
        meuCarro.ano = 1978;
        meuCarro.ligado = false; // Começa desligado

        // Usando os métodos do objeto
        meuCarro.exibirFichaTecnica();
        meuCarro.ligar();
    }
}