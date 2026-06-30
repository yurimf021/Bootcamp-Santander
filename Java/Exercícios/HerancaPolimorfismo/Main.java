package HerancaPolimorfismo;

public class Main {
    public static void main(String[] args) {
        // 1. Crie um ingresso normal de R$ 40,00
        Ingresso comum = new Ingresso("Vingadores", 40.0, true);
        System.out.println("Valor comum: " + comum.getValor());

        // 2. Crie uma Meia Entrada para o mesmo filme
        Ingresso meia = new MeiaEntrada("Vingadores", 40.0, true);
        System.out.println("Valor Meia: " + meia.getValor());

        // 3. Crie um Ingresso Família com 2 pessoas (não deve ter desconto)
        Ingresso familiaPena = new IngressoFamilia("Vingadores", 40.0, true, 2);
        System.out.println("Valor Família (2 pessoas): " + familiaPena.getValor());

        // 4. Crie um Ingresso Família com 4 pessoas (DEVE ter 5% de desconto)
        Ingresso familiaGrande = new IngressoFamilia("Vingadores", 40.0, true, 4);
        System.out.println("Valor Família (4 pessoas): " + familiaGrande.getValor());
    }
}