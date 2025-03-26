package Exe_4_5;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1= new Pessoa();


        pessoa1.NovaPessoa("Roberto",43);
        pessoa1.fazerAniversario();

        System.out.printf("%s, %d",pessoa1.nome,pessoa1.idade);
    }

}
