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

       synchronized public boolean comprobar(double cantidad) {
        if (saldo < cantidad) {
            System.out.println("Saldo insuficiente.");
            return false;
        }else{
            System.out.println("Saldo suficiente.");
            return true;
        }
    }

      synchronized  public void retirar(double cantidad) {
        saldo -= cantidad;
    }
}
