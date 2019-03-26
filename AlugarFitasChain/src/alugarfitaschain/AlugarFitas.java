package alugarfitaschain;
// @author marce
public class AlugarFitas {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //instacia a classe calculada 
        CalculaDescontos calculador = new CalculaDescontos();
        //instancia a cesta de fitas 
        CestaDeFitas cesta = new CestaDeFitas();
        //Adiciona fitas a cesta com nome e valor 
        cesta.adicionaItem(new Fitas("Super Mario Bros",3.0));
        cesta.adicionaItem(new Fitas("Donkey Kong 3",3.0));
        cesta.adicionaItem(new Fitas("Killer Instict",4.0));
        cesta.adicionaItem(new Fitas("Super Bomberman 3",3.50));
        cesta.adicionaItem(new Fitas("Crono Trigger",5.0));
        
        //Calcular o valor da cesta e seu desconto
        double desconto = calculador.calcula(cesta);    
        System.out.println("Valor : "+ cesta.getValor());
        System.out.println("seu desconto é "+desconto); 
        System.out.println("Valor Total : "+(cesta.getValor()-desconto));
    }
}//fim classe
