public class Raton {
private String tipo;
private String color;
private int edad;

    public Raton(String tipo, String color, int edad) {
    this.tipo = tipo;
    this.color = color;
    this.edad = edad;
    }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public void mostrar() {
    System.out.println("Tipo: " + tipo);
    System.out.println("Color: " + color);
    System.out.println("Edad: " + edad);
    }

    public void comerQueso() {
    System.out.println("El raton come queso");
    }
}
