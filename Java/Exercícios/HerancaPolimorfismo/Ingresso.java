package HerancaPolimorfismo;

public class Ingresso {
    private double valor;
    private String NomeF;
    private boolean dublado; ;

    public Ingresso(String NomeF, double valor, boolean dublado) {
        this.NomeF = NomeF;
        this.valor = valor;
        this.dublado = dublado;
    }

    public Ingresso() {
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public String getNomeF() {
         return NomeF;
    }
    public void setNomeF(String NomeF) {
        this.NomeF = NomeF;
    }

    public boolean getDublado() {
        return dublado;
    }
    public void setDublado(boolean dublado){
            this.dublado = dublado;
    }


}