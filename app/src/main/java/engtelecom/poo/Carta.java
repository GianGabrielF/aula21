package engtelecom.poo;

public class Carta {
    private Valor valor;
    private Naipe naipe;

    public Carta(Valor valor, Naipe naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    @Override
    public String toString(){
        return this.valor.toString().toLowerCase() + " de " + this.naipe.toString().toLowerCase();
    }

    public String shortForm(){
        return this.valor.getValue() + this.naipe.simbolo();
    }
    
}
