package wielowatkowosc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DostepDoZasobow {

    private static int counter = 0;

    synchronized public static void incCounter() {
        counter++;
    }
    public static void main(String[] args) throws InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(2);

        es.execute(() -> {
            for(int i = 0; i < 10000000;i++) incCounter();
        });
        es.execute(() -> {
            for(int i = 0; i < 10000000;i++) incCounter();
        });

        es.shutdown();
        es.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println(counter);
    }

}
