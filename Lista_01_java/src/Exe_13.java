import java.util.Scanner;

public class Exe_13 {
    //13. Peça três números e exiba o maior e o menor entre eles.

    public static void main(String[] args) {

        Scanner ler=new Scanner(System.in);

        System.out.printf("Digite o primeiro número: \n");
        int num1= ler.nextInt();
        System.out.printf("Digite o segundo número: \n");
        int num2= ler.nextInt();
        System.out.printf("Digite o terceiro número: \n");
        int num3= ler.nextInt();

        int max, min;


            if (num1>num2){
                max = num1;
                min = num2;


            } else {
                max = num2;
                min = num1;


            }if (max>num3){

            } else {
                max = num3;
            }if (min<num3){

        }else {
                min = num3;
        };

        System.out.printf("%d é maior\n",max);
        System.out.printf("%d é menor",min);


        }
    }

