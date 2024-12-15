package Ej8;

public class Fichajes {
    public static void main(String[] args) {
        Trabajador trabajador = new Trabajador("", 0);
        Thread t = new Thread(trabajador);
        t.start();
    }
}
