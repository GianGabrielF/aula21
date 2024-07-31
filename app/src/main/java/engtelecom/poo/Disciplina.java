package engtelecom.poo;

import java.util.Arrays;

public class Disciplina {

    private String sigla;

    private DiasDaSemana[] dias;

    public Disciplina(String disciplina, DiasDaSemana[] dias){
        this.sigla = disciplina;
        this.dias = dias;
    }

    @Override
    public String toString() {
        return "Disciplina: " + this.sigla + "\n" + Arrays.toString(this.dias);
    }
    
    

}
