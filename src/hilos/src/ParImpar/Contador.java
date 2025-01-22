package ParImpar;

public class Contador {
    private int contador = 0;
    private int max;

    public Contador(int max) {
        this.max = max;
    }
    public synchronized void incrementar() {
        contador++;
    }

    public synchronized void decrementar() {
        contador--;
    }

    public synchronized int getContador() {
        return contador;
    }

    public synchronized int getMax() {
        return max;
    }
}
