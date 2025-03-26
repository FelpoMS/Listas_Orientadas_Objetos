import java.util.Scanner;

public class Exe_12 {
    //12. Peça dois números e informe qual é o maior.

    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);

        System.out.printf("Dogite um número: ");
        int num1= ler.nextInt();
        System.out.printf("Dogite mais um número: ");
        int num2= ler.nextInt();

        if (num1>num2){
            System.out.printf("O %d é o maior\n",num1);

        } else {
            System.out.printf("O %d é o maior\n",num2);
        }
    }
}
