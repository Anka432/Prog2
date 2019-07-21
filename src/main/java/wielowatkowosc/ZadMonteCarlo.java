package wielowatkowosc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ZadMonteCarlo {

    private static int counter = 0;

    synchronized public static void incCounter() {
        counter++;
    }
    public static void main(String[] args) throws InterruptedException {

        ZadMonteCarlo zadMonteCarlo = new ZadMonteCarlo();
        System.out.println(zadMonteCarlo.monteCarlo(100000));
    }

        public double monteCarlo ( long iterations) throws InterruptedException {

            ExecutorService service = Executors.newFixedThreadPool(10);
            service.execute(() -> {
                for (long i = 0; i < iterations; i++) {
                    double x = Math.random();
                    double y = Math.random();
                    double r = Math.sqrt(x * x + y * y);
                    if (r <= 1) {
                        incCounter();
                    }
                }
            });

            service.shutdown();
            service.awaitTermination(500, TimeUnit.SECONDS);

            return 4.0 * counter / iterations;
        }
    }
