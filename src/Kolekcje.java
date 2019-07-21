import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Kolekcje {
    public static void main(String[] args) {
        System.out.println(simpleApproach());
        System.out.println(streamApproach());
    }

    private static Map<Integer, String> streamApproach() {
        Map<Integer, String> result = IntStream.range(0, 100)
                .filter(n -> n % 2 == 1)
                .mapToObj(n -> n * n)
                .filter(n -> n <= 701)
                .collect(Collectors.toMap(
                        n -> n,
                        n -> String.valueOf(Math.round(Math.sqrt(n)))
                ));
        return result;
    }

    private static Map<Integer, String> simpleApproach() {
        List<Integer> list099 = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list099.add(i);
        }

        List<Integer> listOdd = new ArrayList<>();
        for(Integer element : list099) {
            if (element % 2 == 1) {
                listOdd.add(element);
            }
        }

        List<Integer> listSquares = new ArrayList<>();
        for (Integer element : listOdd) {
            listSquares.add(element * element);
        }

        List<Integer> listSmallSquares = new ArrayList<>();
        for (Integer element : listSquares) {
            if (element <= 701) {
                listSmallSquares.add(element);
            }
        }

        Map<Integer, String> result = new HashMap<>();
        for (Integer element : listSmallSquares) {
            result.put(element, String.valueOf(Math.round(Math.sqrt(element))));
        }

        return result;
    }
}
