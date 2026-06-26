public class Carro {
    int velocidade = 0;
    boolean ligado = false;
    int marcha = 0; 

    public void Ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O carro está ligado! Vrum vrum!");
        } else {
            System.out.println("O carro já estava ligado.");
        }
    }

    public void Desligar() {
        if (marcha == 0 && velocidade == 0 && ligado == true) {
            ligado = false;
            System.out.println("O carro foi desligado com segurança.");
        }
         else {
            System.out.println("Erro: Para desligar, o carro deve estar ligado a 0 km/h e em ponto morto (marcha 0).");
        }
    }

    public void Acelerar() {
        if (!ligado) {
            System.out.println("Erro: Precisa ligar o carro antes de acelerar.");
            return;
        }
        if (marcha == 0) {
            System.out.println("Erro: O carro está em ponto morto. Engate a 1ª marcha para arrancar.");
            return;
        }

        if (marcha == 1 && velocidade >= 20) {
            System.out.println("Limite da 1ª marcha atingido (20 km/h). Troque para a 2ª marcha!");
            return;
        }
        if (marcha == 2 && velocidade >= 40) {
            System.out.println("Limite da 2ª marcha atingido (40 km/h). Troque para a 3ª marcha!");
            return;
        }
        if (marcha == 3 && velocidade >= 60) {
            System.out.println("Limite da 3ª marcha atingido (60 km/h). Troque para a 4ª marcha!");
            return;
        }
        if (marcha == 4 && velocidade >= 80) {
            System.out.println("Limite da 4ª marcha atingido (80 km/h). Troque para a 5ª marcha!");
            return;
        }
        if (marcha == 5 && velocidade >= 100) {
            System.out.println("Limite da 5ª marcha atingido (100 km/h). Troque para a 6ª marcha!");
            return;
        }
        if (marcha == 6 && velocidade >= 120) {
            System.out.println("Velocidade máxima do carro atingida! (120 km/h)");
            return;
        }

        
        velocidade += 1;
        System.out.println("Acelerando... Velocidade atual: " + velocidade + " km/h");
    }

    public void DiminuirVelocidade() {
        if (!ligado) {
            System.out.println("Erro: O carro está desligado.");
            return;
        }
        if (velocidade > 0) {
            velocidade -= 1;
            System.out.println("Reduzindo... Velocidade atual: " + velocidade + " km/h");
        } else {
            System.out.println("O carro já está parado. (0 km/h).");
        }
    }

    public void Curva(String direcao) {
        if (!ligado) {
            System.out.println("Erro: O carro está desligado.");
            return;
        }
        if (velocidade >= 1 && velocidade <= 40) {
            System.out.printf("Curva realizada para a %s com segurança!\n", direcao);
        } else if (velocidade == 0) {
            System.out.println("Erro: O carro está parado, não é possível realizar a curva.");
        } else {
            System.out.println("Erro: Velocidade muito perigosa para realizar a curva! (Apenas entre 1 e 40 km/h)");
        }
    }

    public void VerificarVelocidade() {
        System.out.println("Painel: " + velocidade + " km/h (Marcha engatada: " + marcha + ")");
    }

    public void TrocarMarcha(int acao) {
        if (!ligado) {
            System.out.println("Erro: O carro está desligado .");
            return;
        }

        if (acao == 1) { 
            if (marcha == 0 && velocidade == 0) {
                marcha = 1;
                System.out.println("Engatou a 1ª marcha!");
            } else if (marcha == 1 && velocidade >= 20) {
                marcha = 2;
                System.out.println("Engatou a 2ª marcha!");
            } else if (marcha == 2 && velocidade >= 40) {
                marcha = 3;
                System.out.println("Engatou a 3ª marcha!");
            } else if (marcha == 3 && velocidade >= 60) {
                marcha = 4;
                System.out.println("Engatou a 4ª marcha!");
            } else if (marcha == 4 && velocidade >= 80) {
                marcha = 5;
                System.out.println("Engatou a 5ª marcha!");
            } else if (marcha == 5 && velocidade >= 100) {
                marcha = 6;
                System.out.println("Engatou a 6ª marcha!");
            } else if (marcha == 6) {
                System.out.println("Erro: Você ja está na última marcha!");
            } else {
                System.out.println("Acelere mais para trocar de marcha!");
            }
            
        } else if (acao == 2) { 
            if (marcha == 6 && velocidade <= 100) {
                marcha = 5;
                System.out.println("Reduziu para a 5ª marcha!");
            } else if (marcha == 5 && velocidade <= 80) {
                marcha = 4;
                System.out.println("Reduziu para a 4ª marcha!");
            } else if (marcha == 4 && velocidade <= 60) {
                marcha = 3;
                System.out.println("Reduziu para a 3ª marcha!");
            } else if (marcha == 3 && velocidade <= 40) {
                marcha = 2;
                System.out.println("Reduziu para a 2ª marcha!");
            } else if (marcha == 2 && velocidade <= 20) {
                marcha = 1;
                System.out.println("Reduziu para a 1ª marcha!");
            } else if (marcha == 1 && velocidade == 0) {
                marcha = 0;
                System.out.println("Desengatou para o Ponto Morto !");
            } else if (marcha == 0) {
                System.out.println("Erro: O carro já está em ponto morto!");
            } else {
                System.out.println("Reduza a velocidade antes antes de trocar a marcha!");
            }
        } else {
            System.out.println("Opção inválida. Utilize 1 para subir ou 2 para reduzir a marcha.");
        }
    }
}