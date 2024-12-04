package hiloc;

public class VariosHilos {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            HiloC hc = new HiloC(i);
            hc.start();
        }
        System.out.println("Hilos creados...");
    }
}
