import java.util.Scanner;

public class Exe_15 {
    //15. Peça ao usuário uma senha e verifique se ela é igual a "1234". Caso contrário, exiba "Acesso negado".

    public static void main(String[] args) {


        Scanner ler=new Scanner(System.in);

        System.out.printf("Digite uma senha de 4 digitos: \n");
        int senha=ler.nextInt();

        if (senha==1234){
            System.out.printf("Senha Verificada");
        } else {
            System.out.printf("Acesso negado");
        }
    }
}
