package Exe_08;

public class ContaBancaria {
    private String titular;
    private double Saldo;
    private int numeroConta;

    public void deposito(double valor) {
        Saldo += valor;
    }

    public void sacar(double valor) {
        Saldo -= valor;
    }

    public void novaConta(String titular) {
        numeroConta++;
        this.titular = titular;

    }

    public void dadosConta() {
        System.out.printf("Titular:%s  \nNúmero da conta: %d \n Saldo: %.2f R$",this.titular,numeroConta,Saldo);
    }

}
