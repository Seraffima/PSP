package Banco;

public class Cliente extends Thread {
    private final String nombre;
    private final Cuenta cuenta;
    private final float cantidad;
    private float total;

    public Cliente(String nombre, Cuenta cuenta, float cantidad) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.cantidad = cantidad;
    }

    public void run() {
        while (cuenta.comprobar(cantidad)) {
            cuenta.retirar(cantidad);
            total += cantidad;
            System.out.println("Cliente: " + nombre + " Cantidad retirada: " + cantidad + " Saldo: " + cuenta.getSaldo());
        }
        System.out.println("Cliente: " + nombre + " Total retirado: " + total);
    }

}
