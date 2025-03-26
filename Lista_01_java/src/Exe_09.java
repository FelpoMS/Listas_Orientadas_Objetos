import java.util.Scanner;

public class Exe_09 {
    //9. Leia dois números e exiba o maior e o menor entre eles.

    public static void main(String[] args) {

        Scanner ler=new Scanner(System.in);

        System.out.printf("Digite Primeiro Número: ");
        int num1=ler.nextInt();
        System.out.printf("Digite Segundo Número: ");
        int num2=ler.nextInt();

        if (num1>num2){
            System.out.printf("O %d é maior\n",num1);
            System.out.printf("O %d é menor\n",num2);
        } else {
            System.out.printf("O %d é maior\n",num2);
            System.out.printf("O %d é menor\n",num1);
        }

    }
}
