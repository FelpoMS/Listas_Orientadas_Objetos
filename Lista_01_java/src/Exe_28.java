import java.util.Scanner;

public class Exe_28 {
    //28. Peça ao usuário para digitar uma senha e informe se ela contém pelo menos 8 caracteres.

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.printf("Digite uma Senha:");
        String senha=ler.nextLine();

        if (senha.length()>=8){
            System.out.printf("%s tem pelo menos 8 caracter",senha);
        }else{
            System.out.printf("senha precisa ser maior");
        }







    }
}
