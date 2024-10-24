public class Ex21 {
    private String titular;
    private double saldo;
    private int numeroConta;

    public Ex21(String titular, int numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    public void transferir(Ex21 destino, double valor) {
        if (valor > 0 && valor <= saldo) {
            this.saldo -= valor;
            destino.saldo += valor;
            System.out.println("Transferência de R$" + valor + " para a conta " + destino.numeroConta + " realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor de transferência inválido.");
        }
    }

    public String getTitular() {
        return titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public static void main(String[] args) {
        Ex21 conta1 = new Ex21("João", 12345);
        Ex21 conta2 = new Ex21("Maria", 67890);

        conta1.depositar(500);
        conta1.sacar(200);
        conta1.transferir(conta2, 100);

        System.out.println("Saldo da conta de João: R$" + conta1.getSaldo());
        System.out.println("Saldo da conta de Maria: R$" + conta2.getSaldo());
    }
}
