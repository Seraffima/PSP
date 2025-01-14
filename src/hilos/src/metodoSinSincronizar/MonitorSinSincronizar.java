package metodoSinSincronizar;

import java.util.Date;

public class MonitorSinSincronizar {
	public static void main(String[] args) {
		try {
			long ini = new Date().getTime();
			
			Contador contador = new Contador();
			
			Hilo hilo = new Hilo(contador);
			Hilo hilo2 = new Hilo(contador);
			
			hilo.start();
			hilo2.start();
			
			hilo.join();
			hilo2.join();
			
			long fin = new Date().getTime();
			System.out.println("Tiempo total:" + (fin - ini));
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}
