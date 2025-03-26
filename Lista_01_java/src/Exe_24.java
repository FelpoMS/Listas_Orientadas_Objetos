import java.util.Scanner;

public class Exe_24 {
    //24. Peça ao usuário 5 números e exiba a média deles.

    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);

        int i=0,soma=0,num;

        while (i<5){
            i++;
            System.out.printf("Digite o %d Número: \n",i);
            num= ler.nextInt();
            soma=soma+num;
        }
        System.out.printf("%d é a média dos 5 Número: \n",soma/i);
    }

}
