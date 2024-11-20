public class Persona {
    private String nombre;
    private int edad;
    private String email;
    private String domicilio;

    public Persona(String nombre, int edad, String email) {
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        this.domicilio = domicilio;
    }

    public Persona(String nombre, int edad, String email, String domicilio) {
        this(nombre, edad, email);
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int cumplirAnios(){
        setEdad(getEdad() + 1);
        return getEdad();
    }
}
