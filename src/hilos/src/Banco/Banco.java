package Banco;

public class Banco {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1000);
        Cliente cliente1 = new Cliente("Cliente 1", cuenta, 55);
        Cliente cliente2 = new Cliente("Cliente 2", cuenta, 25);

        cliente1.start();
        cliente2.start();

        try {
            cliente1.join();
            cliente2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
