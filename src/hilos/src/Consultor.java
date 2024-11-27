public class Consultor extends Trabajador {
    private double tarifa;
    private int horas;

    public Consultor(String nombre, String NSS, double tarifa, int horas) {
        super(nombre, NSS);
        this.tarifa = tarifa;
        this.horas = horas;
    }

    public double getTarifa() {return tarifa;}
    public int getHoras() {return horas;}

    public void setTarifa(double tarifa) {this.tarifa = tarifa;}
    public void setHoras(int horas) {this.horas = horas;}

    public double calcularPago() {
        return tarifa * horas;
    }

    public String toString() {
        return "Consultor | " + super.toString() + ", Tarifa: " + tarifa + ", Horas: " + horas + ", Pago: " + calcularPago();
    }
}
