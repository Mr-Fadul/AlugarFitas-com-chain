package alugarfitaschain;
// @author marce
public class Desconto5Fitas implements Desconto{
    private Desconto proximo;    
    //recebe a quantidade de itens.     
    @Override
    public double desconta(CestaDeFitas cesta) {
        //se maior ou igual a 5 e pega o valor da cesta e da o desconto de 10%.
        if(cesta.getItens().size() >= 5) {
          return cesta.getValor() * 0.1;
        }
        else {
            //caso tenha menos de 5 itens, passa o valor da cesta
            //para a função na próxima classe instanciada. 
          return proximo.desconta(cesta);
        }
      }
      //preenche a variavel 'próximo' com a próxima classe da corrente
    // a variavel passar a ser um objeto instanciado.
        @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
      }
}//fim classe
