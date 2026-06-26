public class ContaBancaria {
    private double saldo;
    private double limiteChequeEspecial;
    private double chequeEspecialUsado;

    // Construtor
    public ContaBancaria(double depositoInicial) {
        this.saldo = depositoInicial;
        this.chequeEspecialUsado = 0.0;

        if (depositoInicial <= 500.0) {
            this.limiteChequeEspecial = 50.0;
        } else {
            this.limiteChequeEspecial = depositoInicial * 0.50;
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: R$ " + String.format("%.2f", this.saldo));
    }

    public void consultarChequeEspecial() {
        double disponivel = this.limiteChequeEspecial - this.chequeEspecialUsado;
        System.out.println("Limite Total do Cheque Especial: R$ " + String.format("%.2f", this.limiteChequeEspecial));
        System.out.println("Limite Disponível para uso: R$ " + String.format("%.2f", disponivel));
    }

    public void verificarChequeEspecial() {
        if (this.chequeEspecialUsado > 0) {
            System.out.println("Status: Você está usando R$ " + String.format("%.2f", this.chequeEspecialUsado) + " do cheque especial.");
        } else {
            System.out.println("Status: Conta no azul. Você não está utilizando o cheque especial.");
        }
    }

    public void sacar(double valor) {
        double limiteDisponivel = this.limiteChequeEspecial - this.chequeEspecialUsado;

        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado. Saldo atualizado.");
        } else if (valor <= (this.saldo + limiteDisponivel)) {
            double falta = valor - this.saldo;
            this.saldo = 0.0;
            this.chequeEspecialUsado += falta;
            System.out.println("Saque realizado. Você utilizou R$ " + String.format("%.2f", falta) + " do seu limite de Cheque Especial.");
        } else {
            System.out.println("Operação negada: Saldo e limite insuficientes.");
        }
    }

    public void pagarBoleto(double valor) {
        System.out.println("--- Pagamento de Boleto ---");
        sacar(valor);
    }

    public void depositar(double valor) {
        if (this.chequeEspecialUsado > 0) {
            double taxa = this.chequeEspecialUsado * 0.20;
            double dividaTotal = this.chequeEspecialUsado + taxa;

            if (valor >= dividaTotal) {
                valor -= dividaTotal;
                this.chequeEspecialUsado = 0.0;
                this.saldo += valor;
                System.out.println("Dívida do cheque especial e taxa de 20% quitadas. O restante foi adicionado ao saldo.");
            } else {
                double abatimentoPrincipal = valor / 1.20;
                this.chequeEspecialUsado -= abatimentoPrincipal;
                System.out.println("Depósito parcial. A dívida do cheque especial foi reduzida, mas ainda há saldo devedor.");
            }
        } else {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        }
    }
}