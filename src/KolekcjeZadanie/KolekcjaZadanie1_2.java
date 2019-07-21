package KolekcjeZadanie;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class KolekcjaZadanie1_2 {
    public static void main(String[] args) {

        Set<String> imiona = new HashSet<>();

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
    }
}
