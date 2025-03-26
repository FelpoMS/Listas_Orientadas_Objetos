import java.util.Scanner;

public class Exe_04 {
    //4. Leia três números e exiba a média aritmética.

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.printf("Digite o Primeiro Número:");
        int num1 = ler.nextInt();

        System.out.printf("Digite o Segundo Número:");
        int num2 = ler.nextInt();

        System.out.printf("Digite o Terceiro Número:");
        int num3 = ler.nextInt();

        int media=num1+num2+num3;

        System.out.printf("A Média aritmética:%d",media/3);


    }
}
