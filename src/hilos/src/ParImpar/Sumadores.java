package ParImpar;

public class Sumadores extends Thread {
    private final boolean par;
    private final Contador contador;

    public Sumadores(boolean par, Contador contador) {
        this.par = par;
        this.contador = contador;
    }

    public void run() {
        while (contador.getContador() < contador.getMax()) {
            if (par) {
                if (contador.getContador() % 2 == 0) {
                    contador.incrementar();
                    System.out.println("Sumador par: " + contador.getContador());
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }else{
                if (contador.getContador() % 2 != 0) {
                    contador.incrementar();
                    System.out.println("Sumador impar: " + contador.getContador());
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
