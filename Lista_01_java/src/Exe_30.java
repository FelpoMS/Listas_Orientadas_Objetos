import java.util.Scanner;

public class Exe_30 {
    //30. Peça ao usuário para digitar uma palavra e verifique se ela é um palíndromo (exemplo: "arara").

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.printf("Digite uma Palavra:");
        String palavra=ler.nextLine();
        String reverse="", palavral=palavra.toLowerCase();




        for(int i=palavral.length()-1; i>=0; i--){

            reverse=reverse+palavral.charAt(i); //esta colocando ao contrario

        }

        if (palavral.equals(reverse)){
            System.out.printf("%s é um palíndromo\n",palavra);
        }else {
            System.out.printf("%s não é palíndromo\n",palavra);
        }

    }
}
