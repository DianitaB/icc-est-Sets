import java.util.Set;
import controller.Sets;

public class App {
    public static void main(String[] args) throws Exception {
        Sets set = new Sets();
        System.out.println(set);
        runHasSet(set);
        runLinkedHashSet(set);
        runTreeHashSet(set);
        runTreeComparatorSet(set);
    }

    public static void runHasSet(Sets set) {
        Set<String> ejemploHashSet = set.construirHashSet();
        System.out.println("----HashSet-----");
        System.out.println("Elementos del HashSet (no se garantiza el orden): ");
        for (String elemento : ejemploHashSet) {
            System.out.println(elemento);
        }
    }

    public static void runLinkedHashSet(Sets set) {
        Set<String> ejemploLinkedHashSet = set.construirLinkedHashSet();
        System.out.println("-----LinkedHashSet------");
        for (String elemento : ejemploLinkedHashSet) {
            System.out.println(elemento);
        }
    }

    public static void runTreeHashSet(Sets set) {
        Set<String> ejemplosTreeSet = set.construirTreeSet(); 
        System.out.println("-----TreeSet------");
        for (String eleme : ejemplosTreeSet) {
            System.out.println(eleme);
        }
    }
    public static void runTreeComparatorSet(Sets set){
        Set<String> resultado = set.construirTreeSetConComparador();

        System.out.println("---------TreeSetConComparator---------");
        for (String palabra : resultado) {
            System.out.println(palabra);
        }

    }
}
