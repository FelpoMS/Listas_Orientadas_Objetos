package Exe_6_7;
//6. Criando Métodos Getters e Setters
//6. Criar uma classe "Produto" com os atributos nome e preco.
//o Definir os atributos como private.
//o Criar métodos get e set para acessar e modificar os valores.
//o No main, crie um objeto, altere os atributos com os setters e exiba com os getters.
//7. Criando e usando múltiplos objetos
//7. Modifique a classe Produto para incluir um método aplicarDesconto(double percentual), que reduz
//o preço com base no percentual.
//o No main, crie dois objetos e aplique descontos diferentes.
public class Main {
    public static void main(String[] args) {

        Produto arroz = new Produto();
        Produto Acai = new Produto();

        arroz.setproduto("Arroz",19.99);
        arroz.aplicarDesconto(50);
        arroz.getproduto();

        Acai.setproduto("Açai 2L",60.00);
        Acai.aplicarDesconto(30);
        Acai.getproduto();




    }
}
