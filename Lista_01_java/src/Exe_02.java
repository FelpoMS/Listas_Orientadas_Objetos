import java.util.Scanner;

public class Exe_02 {
    //2. Peça ao usuário para digitar seu nome e exiba uma mensagem de boas-vindas.
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.printf("Digite Seu Nome:");
        String nome = ler.nextLine();

        System.out.printf("Boas-Vindas %S",nome);


    }
}
