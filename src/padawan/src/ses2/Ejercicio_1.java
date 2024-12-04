package ses2;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String nombreyapellidos;
      int edad;
      String usuario;
      double cuota;

        System.out.println("Introduce tu nombre y apellidos: ");
        nombreyapellidos = sc.nextLine();
        System.out.println("Introduce tu edad: ");
        edad = sc.nextInt();
        System.out.println("Introduce tu usuario: ");
        usuario = sc.next();
        System.out.println("Introduce tu cuota a pagar: ");
        cuota = sc.nextDouble();

        System.out.println("===================================");
        System.out.println("Nombre y apellidos: " + nombreyapellidos);
        System.out.println("Edad: " + edad);
        System.out.println("Usuario: " + usuario);
        System.out.println("Cuota a pagar: " + cuota);
    }
}
