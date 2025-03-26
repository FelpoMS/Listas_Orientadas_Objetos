import java.util.Scanner;

public class Exe_14 {
    //14. Peça ao usuário sua idade e informe se ele é menor de idade ou maior de idade.

    public static void main(String[] args) {

        Scanner ler=new Scanner(System.in);

        System.out.printf("Digite a sua idade: \n");
        int idad=ler.nextInt();

        if (idad>18){

            System.out.printf("O usuario tem %d anos, é maior de idade",idad);

        }else {
            System.out.printf("O usuario tem %d anos, é menor de idade",idad);
        }

    }
}
