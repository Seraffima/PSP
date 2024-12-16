package fichaje;

public class Fichajes {
    public static void main(String[] args) {
        Trabajador trabajador = new Trabajador();
        Thread t = new Thread(trabajador);
        t.start();
    }
}
