package Exe_1_3;

class Carro {
    public String marca;
    public String modelo;
    public int ano;

    void exibirDados(){
        System.out.printf("%s, %s, %d",this.marca,this.modelo,this.ano);
    }

    void novoCarro(String marca,String modelo,int ano){
        this.marca=marca;this.modelo=modelo;this.ano=ano;
    }
}
