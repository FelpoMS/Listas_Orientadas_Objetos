import java.util.Scanner;

public class Exe_23 {
    //23. Peça ao usuário 10 números e exiba a soma total.

    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int i=0,soma=0,num;

        while (i<10){
            i++;
            System.out.printf("Digite o %d Número: \n",i);
            num= ler.nextInt();
            soma=soma+num;

        }
        System.out.printf("%d é a soma total",soma);
    }
}
