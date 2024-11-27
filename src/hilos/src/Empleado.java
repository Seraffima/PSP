public class Empleado extends Trabajador {
    private double sueldo;
    private double impuestos;

    public Empleado(String nombre, String NSS, double sueldo) {
        super(nombre, NSS);
        this.sueldo = sueldo;
        this.impuestos = 0.3*sueldo;
    }

    public double getSueldo() {return sueldo;}
    public double getImpuestos() {return impuestos;}

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
        this.impuestos = 0.3*sueldo;
    }

    public String toString() {
        return "Empleado | " + super.toString() + ", Sueldo: " + sueldo + ", Impuestos: " + impuestos;
    }
}
