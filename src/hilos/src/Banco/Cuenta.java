package Banco;

public class Cuenta {
    private double saldo;
    private int numero_reintegros;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void comprobar(double cantidad) {
        if (saldo < cantidad) {
            System.out.println("Saldo insuficiente.");
            return;
        }else{
            System.out.println("Saldo suficiente.");
        }
    }

    public void retirar(double cantidad) {
        saldo -= cantidad;
    }
}
