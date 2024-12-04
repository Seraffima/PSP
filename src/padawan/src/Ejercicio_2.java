public class Ejercicio_2 {
    public static void main(String[] args) {
        double m =23;
        double n = 12;
        double resultado = 0;
        resultado = m + n;
        System.out.println(resultado);
        resultado -= 10;
        resultado *= m;
        System.out.println("El resultado después de restar 10 y multiplicar por m es: " + resultado);
        resultado /= n;
        System.out.println("El resultado final es: " + resultado);
    }
}
