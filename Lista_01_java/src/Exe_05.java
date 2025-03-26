import java.util.Scanner;

public class Exe_05 {

    //5. Leia um número e exiba seu antecessor e sucessor.

    public static void main(String[] args) {

        Scanner ler=new Scanner(System.in);

        System.out.printf("Digite um Número");
        int num1=ler.nextInt();

        System.out.printf("anterior:%d\n",num1-1);
        System.out.printf("sucessor:%d",num1+1);
    }
}
