package Exe_10;

public class Aluno {
    String nome;
    double nota1;
    double nota2;
    double nota3;

    void novaAluno(String nome, double nota1, double nota2) {
        this.nome = nome;this.nota1 = nota1;this.nota2 = nota2;

    }

    void calcularMedia(){
        nota3 = (this.nota1 + this.nota2) / 2;
    }

    void verificarAprovacao(){
        if(nota3 >= 7 && nota3 <= 10){
            System.out.printf("Aprovado com %.1f",nota3);
        } else {
            System.out.printf("Reprovado com %.1f",nota3);

        }
    }

}
