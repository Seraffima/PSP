package metodoSinSincronizar;

public class Contador {
	private int contador = 0;

	 //Sin monitor, tenemos errores de concurrencia
	 public synchronized void agrega(){
	 contador++;
	 }
	 public synchronized int getContador() {
		return contador;
	}
	/**
	 * Sincronizando el metodo completo se resuelve el problema, pero se bloquean
	 * todos los metodos sincronizados del objeto.
	 */
//	synchronized public void agrega() {
//		contador++;
//	}
//
//	synchronized public int getContador() {
//		return contador;
//	}

}
