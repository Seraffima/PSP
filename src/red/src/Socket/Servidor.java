package Socket;

import java.io.*;
import java.net.*;

public class Servidor {
	public static final int PORT = 4444;

	public static void main(String[] args) throws IOException {
		// Establece el puerto en el que escucha peticiones
		ServerSocket socketServidor = null;
		try {
			socketServidor = new ServerSocket(PORT);
		} catch (IOException e) {
			System.out.println("No puede escuchar en el puerto: " + PORT);
			System.exit(-1);
		}

		System.out.println("Escuchando: " + socketServidor);

		// Crea un pool de hilos para manejar a los clientes
		while (true) {
			try {
				// Se bloquea hasta que recibe alguna petición de un cliente
				// abriendo un socket para el cliente
				Socket socketCliente = socketServidor.accept();
				System.out.println("Conexión aceptada: " + socketCliente);

				// Crea un nuevo hilo para manejar la comunicación con este cliente
				new ClientHandler(socketCliente).start();
			} catch (IOException e) {
				System.out.println("IOException: " + e.getMessage());
			}
		}
	}

	// Clase interna que manejará la comunicación con un cliente específico
	static class ClientHandler extends Thread {
		private final Socket socketCliente;

		public ClientHandler(Socket socketCliente) {
			this.socketCliente = socketCliente;
		}

		@Override
		public void run() {
			try (
					BufferedReader entrada = new BufferedReader(new InputStreamReader(socketCliente.getInputStream()));
					PrintWriter salida = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socketCliente.getOutputStream())), true)
			) {
				String str;
				// Hace eco de lo que le proporciona el cliente, hasta que recibe "Adios"
				str = entrada.readLine();
				while (str != null && !str.equals("Adios")) {
					System.out.println("Cliente: " + str);
					salida.println(str); // Envía de vuelta lo recibido
					str = entrada.readLine();
				}
				System.out.println("Cliente desconectado: " + socketCliente);
			} catch (IOException e) {
				System.out.println("IOException en el manejo del cliente: " + e.getMessage());
			} finally {
				try {
					socketCliente.close();
				} catch (IOException e) {
					System.out.println("Error al cerrar el socket del cliente: " + e.getMessage());
				}
			}
		}
	}
}
