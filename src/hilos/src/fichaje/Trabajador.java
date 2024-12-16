package fichaje;

import java.util.Scanner;

public class Trabajador implements Runnable{
    private String nombre;
    private double horaEntrada = 0.0;

    public Trabajador() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del trabajador: ");
        String nombre = sc.nextLine();
        this.nombre = nombre;
        System.out.println("Introduce la hora de entrada del trabajador: ");
        double horaEntrada = sc.nextDouble();
        this.horaEntrada = horaEntrada;
    }

    public void run() {
        if (horaEntrada <= 9.0) {
            System.out.println("El trabajador " + nombre + " ha llegado a tiempo");
        }else {
            System.out.println("El trabajador " + nombre + " ha llegado tarde");
        }
    }
}
