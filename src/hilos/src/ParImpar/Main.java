package ParImpar;

public class Main {
    public static void main(String[] args) {
        Contador contador = new Contador(100);
        Sumadores sumador1 = new Sumadores(true, contador);
        Sumadores sumador2 = new Sumadores(false, contador);
        Thread hilo1 = new Thread(sumador1);
        Thread hilo2 = new Thread(sumador2);
        hilo1.start();
        hilo2.start();
        try {
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
