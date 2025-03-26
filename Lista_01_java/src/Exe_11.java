import java.util.Scanner;

public class Exe_11 {
    //11. Verifique se um número digitado pelo usuário é par ou ímpar.

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.printf("Digite o Número: ");
        int num=ler.nextInt();
        if (num %2==0){

            System.out.printf("%d é par\n",num);

        }else{
            System.out.printf("%d é impar\n",num);

        }


    }
}
