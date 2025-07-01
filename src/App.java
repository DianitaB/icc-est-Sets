import java.util.Set;

import controller.Sets;

public class App {
    public static void main(String[] args) throws Exception {

        Sets sets = new Sets();

        runHashSet(sets);
        runLinkedList(sets);
        runTreeSet(sets);
        runTreeComparatorSet(sets);
        runTreeSetConComparadorDescendente(sets);
    
    }

    public static void runHashSet(Sets sets) {
        Set<String> resultado = sets.construirHashSet(); 

        System.out.println("----------HashSet----------");
        System.out.println("Elemntos del HashSet (no se garantiza orden)");

        for (String palabra : resultado) {
            System.out.println(palabra);
        }
    }

    public static void runLinkedList(Sets sets) {
        Set<String> resultado = sets.construirLinkedHashSet();

        System.out.println("------LinkedHashSet---------");
        System.out.println("Elementos del LinkedHashSet (orden de inserción):");

        for (String palabra : resultado) {
            System.out.println(palabra);
        }
    }

    public static void runTreeSet(Sets sets){
        Set<String> resultado = sets.constriurTreeSet();

        System.out.println("----------TreeSet----------");
        System.out.println("Elementos del TreeSet (xxxxxxxxx)");

        for (String palabra : resultado) {
            System.out.println(palabra);
        }
    }

    public static void runTreeComparatorSet(Sets sets){
        Set<String> resultado = sets.construirTreeSetConComparador();

        System.out.println("---------TreeSetComparator---------");
        System.out.println("Elemtnos del TreeSetComparator(Por Longitud y luego alfabéticamente)");

        for (String palabra : resultado) {
            System.out.println(palabra);
        }
    }

    public static void runTreeSetConComparadorDescendente(Sets sets) {
    Set<String> resultado = sets.construirTreeSetConComparadorDescendente();
    System.out.println("---------TreeSetComparator Descendente---------");
    System.out.println("Elementos ordenados por longitud descendente y luego alfabéticamente (Z-A):");
    for (String palabra : resultado) {
        System.out.println(palabra);
    }
}

}