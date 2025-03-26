package Exe_09;
//9. Criando um sistema simples
//9. Criar uma classe "Livro" com os atributos titulo, autor e anoPublicacao.
//o Criar um método exibirInformacoes().
//o No main, instanciar três livros diferentes e exibir suas informações.

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();
        Livro livro3 = new Livro();

        livro1.novoLivro("Código limpo","RC Martin",2009);
        livro2.novoLivro("Harry Potter Calice de fogo","JK Rowling",2000);
        livro3.novoLivro("Entendendo Algoritmos","AY Bhargava",2017);

        livro1.exibirInformacoes();
        livro2.exibirInformacoes();
        livro3.exibirInformacoes();

    }
}
