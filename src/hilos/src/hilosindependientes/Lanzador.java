package hilosindependientes;

public class Lanzador {
    public static void main(String[] args) {
        HiloPar hiloPar = new HiloPar();
        HiloInpar hiloInpar = new HiloInpar();
        Thread hilo = new Thread(hiloInpar);
        hiloPar.start();
        hilo.start();
    }
}
