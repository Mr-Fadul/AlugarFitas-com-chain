package alugarfitaschain;
//@author marce
public class SemDesconto implements Desconto{
    //ultimo desconto da corrente para interromper o fluxo
    @Override
    public double desconta(CestaDeFitas cesta) {
        return 0;
    }
    //nesse exemplo não ocorre nada, pois não foi chamado na interface
    public void setProximo(Desconto desconto) {
        // nao tem!
    }
}//fim desconto
