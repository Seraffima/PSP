package Ej8;

import java.util.Scanner;

public class Trabajador implements Runnable{
    private String nombre;
    private double horaEntrada = 0.0;

    public Trabajador(String nombre, double horaEntrada) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del trabajador: ");
        nombre = sc.nextLine();
        System.out.println("Introduce la hora de entrada del trabajador: ");
        horaEntrada = sc.nextDouble();
    }

    public void run() {
        if (horaEntrada <= 9.0) {
            System.out.println("El trabajador " + nombre + " ha llegado a tiempo");
        }else {
            System.out.println("El trabajador " + nombre + " ha llegado tarde");
        }
    }
}
