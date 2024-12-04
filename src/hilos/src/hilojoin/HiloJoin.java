package hilojoin;

public class HiloJoin extends Thread {
    private int c;

    public HiloJoin(int c) {
        this.c = c;
        System.out.println("Creando hilo " + c);
    }

    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Hilo " + c + " interrumpido");
        }
        for (int i = 1; i < 6; i++) {
            System.out.println("Hilo " + c + " línea " + i);
        }
    }
}
