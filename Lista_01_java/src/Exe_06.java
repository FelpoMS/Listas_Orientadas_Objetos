import java.util.Scanner;

public class Exe_06 {

    //6. Leia um número e exiba o dobro, o triplo e a raiz quadrada dele.

    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);

        System.out.printf("Digite um Número: ");
        int num= ler.nextInt();

        System.out.printf("Dobro: %d\n",num*2);
        System.out.printf("Triplo: %d\n",num*3);
        System.out.printf("Raiz Quadrada: "+Math.sqrt(num));

    }
}
