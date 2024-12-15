package Ej3;

public class HiloTic extends Thread {
    public void run() {
        do {
            System.out.println("Tic");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (true);
    }
}
