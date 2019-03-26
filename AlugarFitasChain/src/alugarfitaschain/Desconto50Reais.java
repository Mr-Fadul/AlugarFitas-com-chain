package alugarfitaschain;
// @author marce
public class Desconto50Reais implements Desconto{
    private Desconto proximo;
    //calcular desconto em uma cesta com 50 reais ou mais de fitas, desconto de 15%
    @Override
    public double desconta(CestaDeFitas cesta) {
      if(cesta.getValor() >= 50) {
        return cesta.getValor() * 0.15;
      }
      else {
        return proximo.desconta(cesta);
      }
    }
    //chama o proxímo desconto caso as condições não sejam atendidas
    @Override
    public void setProximo(Desconto proximo) {
      this.proximo = proximo;
    }
}//fim classe
