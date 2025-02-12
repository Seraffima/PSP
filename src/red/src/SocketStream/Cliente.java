package SocketStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Cliente {

    public static void main(String[] args) {
        try {
            System.out.println("Creando socket cliente");
            Socket clientSocket = new Socket();
            System.out.println("Estableciendo conexión");
            InetSocketAddress addr = new InetSocketAddress("172.168.0.105",5555);
            clientSocket.connect(addr);
            
            InputStream is = clientSocket.getInputStream();
            OutputStream os = clientSocket.getOutputStream();
            
            System.out.println("Enviando mensajes");
            
            String mensaje0 = "HOLA LAURA!!";
            String mensaje1 = "MENSAJE 1\n";
            String mensaje2 = "MENSAJE 2\n";
            String mensaje3 = "MENSAJE 3\n";
            os.write(mensaje0.getBytes());
            os.write(mensaje1.getBytes());
            os.write(mensaje2.getBytes());
            os.write(mensaje3.getBytes());
                        
            System.out.println("Mensaje enviado");
            System.out.println("Cerrando socket cliente");
            clientSocket.close();
            System.out.println("Terminado");
            
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
}
