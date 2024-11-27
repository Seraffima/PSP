public class Trabajador {
    private String nombre;
    private String NSS;

    public Trabajador(String nombre, String NSS) {
        this.nombre = nombre;
        this.NSS = NSS;
    }

    public String getNombre() {return nombre;}
    public String getNSS() {return NSS;}

    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setNSS(String NSS) {this.NSS = NSS;}

    public String toString() {
        return "Nombre: " + nombre + ", NSS: " + NSS;
    }
}
