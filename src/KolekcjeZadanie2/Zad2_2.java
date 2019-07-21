package KolekcjeZadanie2;

import java.util.HashMap;
import java.util.Scanner;

public class Zad2_2 {

    public static void main(String[] args) {

        HashMap<String,String >dane = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        String linijka = scanner.nextLine();
        String pesel = "";
        String imieNazwisko;

        while (!pesel.equals("0")) {
            System.out.println(pesel);
            linijka = scanner.nextLine();

            String[]fragmenty= linijka.split(" ");
            pesel = fragmenty[0];
            imieNazwisko= fragmenty[1]+" "+fragmenty[2];

            dane.put(pesel,imieNazwisko);
        }
        System.out.println(dane);
        System.out.println(dane.containsValue("93041097672"));
    }
}
