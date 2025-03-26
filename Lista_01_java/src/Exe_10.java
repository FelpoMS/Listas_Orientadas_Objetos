import java.util.Scanner;

public class Exe_10 {
    //10. Leia um número e exiba se ele é positivo, negativo ou zero.

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.printf("Digite Primeiro Número: ");
        int num=ler.nextInt();

        if (num>=0){
            System.out.printf("O %d é Positivo ",num);
        }else {
            System.out.printf("O %d é Negativo ",num);
        }
    }
}
