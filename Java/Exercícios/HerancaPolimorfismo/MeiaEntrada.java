package HerancaPolimorfismo;

public class MeiaEntrada extends Ingresso{
    public MeiaEntrada(String NomeF,
                       double valor,
                       boolean dublado) {
        super(NomeF, valor, dublado);
    }

    @Override
    public double getValor() {
        return (super.getValor())/2;
    }
}
