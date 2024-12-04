package raton;

public class Raton {
    private String nombre;
    private int tiempoComer;

    public Raton(String nombre, int tiempoComer) {
        this.nombre = nombre;
        this.tiempoComer = tiempoComer;
    }

    public void ratonComer() {
        System.out.println("El ratón " + nombre + " está comiendo");
        try {
            Thread.sleep(tiempoComer*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("El ratón " + nombre + " ha terminado de comer");
    }
    public static void main(String[] args) {
        Raton jerry = new Raton("Jerry", 7);
        Raton mickey = new Raton("Mickey", 2);
        Raton fievel = new Raton("Fievel", 5);
        Raton speedy = new Raton("Speedy", 3);
        jerry.ratonComer();
        mickey.ratonComer();
        fievel.ratonComer();
        speedy.ratonComer();
    }
}


