package hilcrunnable;

public class VariosHilosR {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            HiloCR hiloCR = new HiloCR(i);
            Thread hilo = new Thread(hiloCR);
            hilo.start();
        }
        System.out.println("Hilos creados...");
    }
}
