package Ej10;

import java.util.Scanner;

public class EstacionesMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la estación del año: ");
        String estacion = sc.nextLine();
        Estacion estacion1 = new Estacion("Primavera");
        Thread hiloEstacion = new Thread(estacion1);
        hiloEstacion.start();
    }
}
