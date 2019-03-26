package alugarfitaschain;
//@author marce
public interface Desconto {
    //recebe o valor do orçamento
    double desconta(CestaDeFitas cesta);
    //setar qual desconto será chamado em seguida pela classe implementada na interface
    void setProximo(Desconto proximo);
}//fim classe
