package wielowatkowosc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumaKwadratowLiczbPierwszych {

    public static boolean isPrime(int number) {
        return number > 2
                && IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(n -> (number % n == 0));
    }

    public static void main(String[] args) {

        List<Integer> liczby = new ArrayList<>();

        for (int i = 201; i < 1200; i++) {

            liczby.add(i);
//            if (isPrime(i)) {
//                if (i % 10 == 3) {
//                    liczby.add(i);
//                }
//            }
        }
        List<Integer>liczbyPierwszeZTrojką =liczby.stream()
                .filter(SumaKwadratowLiczbPierwszych::isPrime)
                .filter(liczba->liczba%10==3)
                .collect(Collectors.toList());


        System.out.println(liczby);

        int sumaKwadratow = 0;
        for (int liczba:liczbyPierwszeZTrojką) {
            sumaKwadratow += liczba*liczba;
        }
        System.out.println("Suma kwadratów liczb pierwszych: "+sumaKwadratow);
    }
}
