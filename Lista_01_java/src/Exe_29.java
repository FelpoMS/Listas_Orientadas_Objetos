import java.util.Scanner;

public class Exe_29 {
    //29. Leia um nome e verifique se ele começa com a letra "A".

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.printf("Digite um Nome:");
        String nome=ler.nextLine();
        String nomeL=nome.toLowerCase();


            char cont=nomeL.charAt(0);

            if (cont == 'a') {

                System.out.printf("%s começa com A",nome);
            }else {
                System.out.printf("%s não começa com A",nome);
            }

    }
}
