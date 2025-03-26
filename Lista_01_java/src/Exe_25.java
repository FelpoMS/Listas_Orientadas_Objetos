import java.util.Scanner;

public class Exe_25 {
    //25. Leia números até que o usuário digite 0 e exiba a soma total.

    public static void main(String[] args) {

        Scanner ler=new Scanner(System.in);

        int i=0,soma=0,num=1;

        while (num!=0){
            i++;
            System.out.printf("\nDigite o %d Número: ",i);
            num= ler.nextInt();
            soma=soma+num;
        }
        System.out.printf("\nSoma dos %d Números é %d",i,soma);
    }
}
