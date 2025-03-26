import java.util.Scanner;

public class Exe_03 {

    //3. Leia dois números e exiba a soma deles.

    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);

        System.out.printf("Digite um Número:");
        int num1 = ler.nextInt();

        System.out.printf("Digite outro Número:");
        int num2 = ler.nextInt();

        System.out.printf("Soma dos Dois Valores:%d",num1+num2);




    }
}
