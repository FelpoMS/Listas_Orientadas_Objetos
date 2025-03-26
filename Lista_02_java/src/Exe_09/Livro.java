package Exe_09;

public class Livro {
    String titulo;
    String autor;
    int anoPulbicacao;

    void novoLivro(String titulo, String autor, int anoPulbicacao) {
        this.titulo = titulo;this.autor = autor;this.anoPulbicacao = anoPulbicacao;
    }

    void exibirInformacoes(){
        System.out.printf("Titulo: %s/ Autor:%s / Ano da publicação:%d\n",titulo,autor,anoPulbicacao);
    }

}
