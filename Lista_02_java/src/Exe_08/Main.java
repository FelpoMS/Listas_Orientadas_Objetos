package Exe_08;
//8. Criando uma class com interação de objetos
//8. Criar uma classe "ContaBancaria" com os atributos titular, saldo e numeroConta.
//o Criar métodos depositar(double valor) e sacar(double valor).
//o No main, instanciar uma conta, depositar e sacar valores, e exibir o saldo final.

public class Main {
    public static void main(String[] args) {

        ContaBancaria ze = new ContaBancaria();

        ze.novaConta("José");

        ze.deposito(200000.00);
        ze.sacar(25000.00);
        ze.dadosConta();


    }
}
