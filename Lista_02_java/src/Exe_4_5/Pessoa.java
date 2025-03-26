package Exe_4_5;

class Pessoa {
   public String nome;
    public int idade;

    void NovaPessoa(String a, int b){
        this.nome=a;this.idade=b;
    }
    void fazerAniversario(){
        this.idade=idade+1;
    }

}
