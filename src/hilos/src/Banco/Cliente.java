package Banco;

import static java.lang.Thread.sleep;

public class Cliente extends Thread {
    private String nombre;
    private Cuenta cuenta;
    private float cantidad;
    private float total;

    public Cliente(String nombre, Cuenta cuenta, float cantidad) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.cantidad = cantidad;
    }

    public void run() {
        while (cuenta.getSaldo() > cantidad) {
            cuenta.comprobar(cantidad);
            cuenta.retirar(cantidad);
            total += cantidad;
            System.out.println("Cliente: " + nombre + " Cantidad retirada: " + cantidad + " Saldo: " + cuenta.getSaldo());
        }
        try {
            sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public float getTotal() {
        return total;
    }
}
