package KolekcjeZadanie;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class KolekcjaZad1 {
    public static void main(String[] args) {

        List<String> imiona = new LinkedList<String>();

        Scanner scanner = new Scanner(System.in);

        String imie = null;

        while (!"-".equals(imie)) {

            System.out.println("podaj imię: ");

            imie = scanner.next();

            if(!imie.equals("-")){

            imiona.add(imie);
            }
        }
        System.out.println("Imiona: " + imiona);
    }
}