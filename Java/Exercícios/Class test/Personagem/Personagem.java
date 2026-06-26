public class Personagem {
    String nome;
    String funcao;
    int nivel;

    public void subirDeNivel(){
        nivel += 1 ;
        System.out.printf("%s subiu para o nivel %s!\n",nome,nivel);
    }
    public void exibirstatus(){
        System.out.printf("Nome: "+nome + "\n");
        System.out.printf("Função: " + funcao + "\n");
        System.out.printf("Nivel :" + nivel + "\n");
    }
}
