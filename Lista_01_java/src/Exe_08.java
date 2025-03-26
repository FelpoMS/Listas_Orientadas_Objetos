import java.util.Scanner;

public class Exe_08 {

    //8. Leia um número e exiba o quadrado e o cubo dele.

    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);

        System.out.printf("Digite um Número: ");
        int num=ler.nextInt();

        System.out.printf("Valor ao quadrado: %d\n",num*num);
        System.out.printf("Valor ao cubo: %d",num*num*num);

    }
}
