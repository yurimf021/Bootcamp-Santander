package HerancaPolimorfismo;
public class IngressoFamilia extends Ingresso {
    private int numeroPessoas;

    public IngressoFamilia(String NomeF, double valor, boolean dublado, int numeroPessoas) {
        super(NomeF, valor, dublado);
        this.numeroPessoas = numeroPessoas;
    }

    @Override
    public double getValor() {
        if(numeroPessoas>3)return super.getValor()*0.95*numeroPessoas;
        else return super.getValor()*numeroPessoas;

        }
    }

