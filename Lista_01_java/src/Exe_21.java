public class Exe_21 {
    //21. Some todos os números de 1 a 100 e exiba o resultado.

    public static void main(String[] args) {

        int i=0,soma=0;

        while (i<99){
            i++;
            soma=i+(i+1);
            System.out.printf("%d+%d=%d\n",i,i+1,soma);
        }
    }
}
