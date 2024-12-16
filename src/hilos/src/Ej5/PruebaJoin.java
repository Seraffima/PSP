package Ej5;

public class PruebaJoin {
    public static void main(String[] args) {

        try {
            Thread hilo1 = new Thread(new HiloJoin(1));
            hilo1.start();
            hilo1.join();
            Thread hilo2 = new Thread(new HiloJoin(2));
            hilo2.start();
            hilo2.join();
            Thread hilo3 = new Thread(new HiloJoin(3));
            hilo3.start();
            hilo3.join();
        } catch (InterruptedException e) {
            System.out.println("Hilo principal interrumpido");
        }
        System.out.println("Hilos terminados...");
    }
}
