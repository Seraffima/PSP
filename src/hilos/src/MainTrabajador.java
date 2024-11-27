public class MainTrabajador {
    public static void main(String[] args) {

        Trabajador t = new Trabajador("Pedro", "1234");
        Consultor c = new Consultor("Juan", "1234", 10, 40);
        Empleado e = new Empleado("Maria", "1234", 1000);

        System.out.println(t);
        System.out.println(c);
        System.out.println(e);
    }
}
