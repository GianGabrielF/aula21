package engtelecom.poo;

public enum Naipe {
    PAUS("\u2663",1),
    OUROS("\u2666",2),
    COPAS("\u2665",3),
    ESPADAS("\u2660",4);

    private String simbolo;
    private int codigo;

    private Naipe(String simbolo, int codigo) {
        this.simbolo = simbolo;
        this.codigo = codigo;
    }

    public String simbolo(){
        return this.simbolo;
    }

    
    
}
