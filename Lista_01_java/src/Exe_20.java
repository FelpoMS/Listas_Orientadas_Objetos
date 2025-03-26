import java.util.Scanner;

public class Exe_20 {
    //20. Leia um número e exiba todos os números de 0 até esse número.

    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);

        System.out.printf("Contar até que Número?: ");
        int num=ler.nextInt();
        int i=-1;

        while (i<num){
            i++;
            System.out.printf("%d\n",i);
        }
    }
}
