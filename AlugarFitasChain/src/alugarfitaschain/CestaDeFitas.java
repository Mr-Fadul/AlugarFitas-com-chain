package alugarfitaschain;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* @author marce*/
public class CestaDeFitas {
    private double valor;
    private List<Fitas> fitas;
//recebe o valor do orçamento e instancia a variavel
    public CestaDeFitas() {
        //recebe a lista montada a partir das Fitas construidas na classe Fitas
        this.fitas = new ArrayList<Fitas>();
    }
//busca valor
    public double getValor() {
        return valor;
    }
//busca a lista e a torna imutavel
    public List<Fitas> getItens() {
        return Collections.unmodifiableList(fitas);
    }
//recebe as Fitas da classe Fitas e preenche uma lista, que retorna no metodo list<Fitas> 
    public void adicionaItem(Fitas fita) {
        fitas.add(fita);
        //soma os valores das fitas da cesta
        valor += fita.getValor();
    }
}//fim classe
