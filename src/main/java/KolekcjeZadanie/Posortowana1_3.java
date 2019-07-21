package KolekcjeZadanie;

import java.util.*;

public class Posortowana1_3 {

    public static void main(String[] args) {

        List<String> imiona = new LinkedList<String>();

        Scanner scanner = new Scanner(System.in);
        String imie = null;

        while (!"-".equals(imie)) {

            System.out.println("podaj imię: ");

            imie = scanner.next();

            if(!imie.equals("-"))
            {
                imiona.add(imie);
            }
        }
        System.out.println("Imiona: " + imiona);
        Collections.sort(imiona);
        for (String item:imiona
        ) {
            System.out.println(item
            );
        }

    }
}
