package metodoSinSincronizar;

public class Hilo extends Thread {
	Contador contador;

	public Hilo(Contador _contador) {
		this.contador = _contador;
	}

	public void run() {
		for (int i = 0; i < 10000000; i++) {
			contador.agrega();
			contador.getContador();
		}
		System.out.println(contador.getContador());
	}
}
