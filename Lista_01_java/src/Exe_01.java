import java.util.Scanner;

public class Exe_01 {
    //1. Escreva um programa que leia um número e o exiba na tela.
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in); // criei um scanner para dentro do algoritmo

        System.out.printf("Digite um Número");
        int Num = ler.nextInt();

        System.out.printf("Seu número digitado:%d\n",Num);


    }
}