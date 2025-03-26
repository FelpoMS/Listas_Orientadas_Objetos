import java.util.Scanner;

public class Exe_26 {
    //26. Leia uma palavra e exiba ela ao contrário.

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.printf("Digite uma Palavra:");
        String palavra=ler.nextLine();
        String reverse="";

        for(int i=palavra.length()-1; i>=0; i--){

            reverse=reverse+palavra.charAt(i);

        }
        System.out.printf("%s",reverse);
    }
}
