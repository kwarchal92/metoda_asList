package wlasciwosci_metody_asList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<String> imiona = Arrays.asList("Adam", "Ewa", "Zosia", "Kamil", "Sławomir", "Magdalena");

        Collections.sort(imiona); //Sortowanie kolekcji wedlug naturalnego porzadku

        System.out.println(imiona);
    }
}
