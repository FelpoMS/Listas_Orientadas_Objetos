import java.util.Scanner;

public class Exe_07 {

//7. Converta um valor em reais para dólares, considerando uma taxa fixa de câmbio.

    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);

        System.out.printf("Digite um Valor de Reais:","R$");
        float reais=ler.nextInt();
        double dolar= reais/5.829;
        System.out.printf("%.2fR$ em Dolar: $%.2f",reais,dolar);

    }
}
