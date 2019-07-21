package wielowatkowosc;

class SimpleThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {


        Thread thread = new Thread(new SimpleThread());
        thread.start();
        Thread.sleep(2);
        System.out.println("wątek wystartował");
    }
}
