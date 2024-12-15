package Ej9;

public class MainIntervalos {
    public static void main(String[] args) {
        HiloIntervalos hilo2 = new HiloIntervalos(8, 3);
        Thread hilo2Thread = new Thread(hilo2);
        hilo2Thread.start();
    }
}
