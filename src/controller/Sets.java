package controller;

import java.util.Comparator;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    public Sets(){

    }

    public Set<String> construirHashSet(){
        Set<String> palabras = new HashSet<>();
        //Tamaño de 4: Porque no permiten el duplicado
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Pera");
        palabras.add("Laptop");
        return palabras;

    }

     public Set<String> construirLinkedHashSet(){
        Set<String> palabras2 = new LinkedHashSet<>();
            palabras2.add("Laptop");
            palabras2.add("Manzana");
            palabras2.add("Pera");
            palabras2.add("Celular");
            palabras2.add("Laptop");
            palabras2.add("Pera");
            palabras2.add("Laptop");
            return palabras2;
        }

     public Set<String> construirTreeSet(){
        Set<String> palabras3 = new TreeSet<>();
            palabras3.add("Laptop");
            palabras3.add("Manzana");
            palabras3.add("Pera");
            palabras3.add("Celular");
            palabras3.add("Laptop");
            palabras3.add("Pera");
            palabras3.add("Laptop");
            return palabras3;
     }
     public Set<String> construirTreeSetConcomparador(){
        Comparator<String> comparadorLongitud = new Comparator<String>() {
        @Override
        public int compare(String s1, String s2) {
            int result = Integer.compare(s1.length(), s2.length());
            if (result == 0) {
                return s1.compareTo(s2); 
            }
            return result;
        }
    };
        Set<String> miTreeSet = new TreeSet<>(comparadorLongitud);
        miTreeSet.add("Laptop");
        miTreeSet.add("Manzana");
        miTreeSet.add("Pera");
        miTreeSet.add("Celular");
        miTreeSet.add("Laptop");
        miTreeSet.add("Pera");
        miTreeSet.add("Laptop");
        miTreeSet.add("Celulas");

        return miTreeSet;
    }
}
