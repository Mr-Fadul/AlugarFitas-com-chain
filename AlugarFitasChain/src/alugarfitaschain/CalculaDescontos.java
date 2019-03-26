package alugarfitaschain;
// @author marce
public class CalculaDescontos {
     public double calcula(CestaDeFitas cesta) {
      //criando primeiro desconto 
      Desconto d1 = new Desconto50Reais();
      // criando segundo desconto
      Desconto d2 = new Desconto5Fitas();
      // criando terceiro desconto
      Desconto d3 = new Desconto3Fitas();
      // criando o proximo desconto
      Desconto d4 = new SemDesconto();

      //próximo desconto depois do d1 é d2
      d1.setProximo(d2);
      //próximo desconto depois d2 é d3
      d2.setProximo(d3);
      //mais um desconto em d3 para d4
      d3.setProximo(d4);

      //chamar descontos em fila , d1 , d2 e d3 formando uma cadeia... chain
      return d1.desconta(cesta);
     }
}//fim classe
