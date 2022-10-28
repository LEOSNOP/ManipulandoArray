package MeuArray;


import java.util.ArrayList;
import java.util.Collection;


public class Exec {
    public static void main(String[] args) {
        //Array list

        Collection<String> nomes = new ArrayList<>();

        nomes.add("LEO");
        nomes.add("Isa");
        nomes.add("Lucas");
        nomes.add("luiza");

        System.out.println("Nomes que estao na lista: " + nomes);

    }
}