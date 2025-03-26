public class Exe_22 {

    //22. Some apenas os números pares de 1 a 100 e exiba o resultado.

    public static void main(String[] args) {
        int i=0,soma=0;


        while (i<100){
            i++;
            soma=i+i;

            if (soma%2==0){
                System.out.printf("%d+%d=%d par\n",i,i,soma);

            }


        }
    }



}

