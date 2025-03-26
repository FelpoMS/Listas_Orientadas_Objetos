package Exe_10;
//10. Criando uma classe com validação de atributos
//10. Criar uma classe "Aluno" com os atributos nome, nota1 e nota2.
//o Criar um método calcularMedia().
//o Criar um método verificarAprovacao(), que retorna "Aprovado" se a média for maior ou igual
//a 7, senão "Reprovado".
//o No main, criar um objeto, calcular a média e exibir o resultado.
public class Main {
    public static void main(String[] args) {
         Aluno aluno = new Aluno();

         aluno.novaAluno("Gui",6,9);
         aluno.calcularMedia();
         aluno.verificarAprovacao();

    }
}
