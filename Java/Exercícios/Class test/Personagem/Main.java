public class Main {
    public static void main(String[]args){
    Personagem meuPersonagem = new Personagem();
    meuPersonagem.nome = "Tyler";
    meuPersonagem.nivel = 1;
    meuPersonagem.funcao = "Lutador";
    System.out.println("============================");
    meuPersonagem.exibirstatus();
    System.out.println("============================");
    for(meuPersonagem.nivel = 1;meuPersonagem.nivel <= 18;meuPersonagem.nivel ++){
        
        meuPersonagem.subirDeNivel();
        meuPersonagem.exibirstatus();
        if(meuPersonagem.nivel ==18){
            System.out.println("============================");
            System.out.println("");
            System.out.println("Você está muito forte!");
            System.out.println("");
            System.out.println("============================");
        }else{
            System.out.println("============================");
            System.out.println("");
            System.out.println("Podes ficar mais forte, coragem!");
            System.out.println("");
            System.out.println("============================");
        }
    }  
    }
}
