package Exe_6_7;

public class Produto {

    private String nome;
    private Double preco;

    void setproduto(String nome, Double preco) {
        this.nome = nome;this.preco = preco;
    }

    void getproduto() {
        System.out.printf("Produto:%s - preco:%.2fR$ \n", nome, preco);
    }

    void aplicarDesconto(double desconto) {
        this.preco -=desconto/100*preco;//-porcentagem = -= valor / 100 * produto a ser descontado.
    }

}
