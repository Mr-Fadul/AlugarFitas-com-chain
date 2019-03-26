package alugarfitaschain;
//@author marce
public class Fitas {
     private String nome;
     private double valor;
// recebe o nome da Fita e valor e seta suas variaveis
    public Fitas(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }
//busca nome da Fita
    public String getNome() {
        return nome;
    }
//busca o valor da Fita
    public double getValor() {
      return valor;
    }
}//fim classe
