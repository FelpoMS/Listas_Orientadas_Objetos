import java.util.Scanner;

public class Exe_27 {
    //27. Peça ao usuário para digitar uma frase e conte quantas vogais há nela.

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.printf("Digite uma Frase:");
        String palavra=ler.nextLine();
        int contvog =0;

        for (int i=0; i<palavra.length(); i++){
            char vog=palavra.charAt(i);

            if(vog=='a'||vog=='e'||vog=='i'||vog=='o'||vog=='u'){
             contvog++;
            }
        }
        System.out.printf("Existe %d vogais em %s",contvog,palavra);

    }
}
