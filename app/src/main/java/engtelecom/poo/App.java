/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package engtelecom.poo;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        ArrayList<Carta> cartas = new ArrayList<>();

        for (Naipe n : Naipe.values()) {
            for (Valor v : Valor.values()) {
                Carta c = new Carta(v, n);
                cartas.add(c);
                
            }
            
        }

        // cartas.forEach(e -> System.out.println(e));

        // System.out.println("\n \n");

        // cartas.forEach(e -> System.out.println(e.shortForm()));

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("\n");


        System.out.println("\uD83C\uDCA1");
        System.out.println("\uD83C\uDCB1");
        System.out.println("\uD83C\uDCB2");
        System.out.println("\uD83C\uDCC3");
        System.out.println("\uD83C\uDCD7");

        























        // DiasDaSemana[] d = {DiasDaSemana.SEG, DiasDaSemana.QUA};

        // Disciplina poo = new Disciplina("POO", d);

        // System.out.println(poo);

        // for (DiasDaSemana diasDaSemana : DiasDaSemana.values()) {
        //     System.out.println(diasDaSemana);
            
        }
}



