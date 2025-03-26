import java.util.Scanner;

public class Exe_19 {
    //19. Peça um número e exiba a tabuada desse número (de 1 a 10).

    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);

        System.out.printf("Digite um Número: ");
        int num=ler.nextInt();
        int i=0,tabuada;
        while (i<10){
            i++;
            tabuada=num*i;
            System.out.printf("Tabuada de %d x %d = %d\n",num,i,tabuada);
        }
    }
}
