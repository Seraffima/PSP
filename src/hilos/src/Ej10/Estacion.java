package Ej10;

public class Estacion implements Runnable {
    private String[] Estaciones = {"Primavera", "Verano", "Otoño", "Invierno"};
    private String miEstacion;

    public Estacion(String miEstacion) {
        this.miEstacion = miEstacion;
    }

    @Override
    public void run() {
        for (int i = 0; i < Estaciones.length; i++) {
            if (Estaciones[i].equals(miEstacion)) {
                System.out.println("Meses de: " + miEstacion);
                switch (i) {
                    case 0:
                        String[] meses = {"Marzo", "Abril", "Mayo"};
                        for (String mes : meses) {
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println(mes);
                        }
                        break;
                    case 1:
                        String[] meses2 = {"Junio", "Julio", "Agosto"};
                        for (String mes : meses2) {
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println(mes);
                        }
                        break;
                    case 2:
                        String[] meses3 = {"Septiembre", "Octubre", "Noviembre"};
                        for (String mes : meses3) {
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println(mes);
                        }
                        break;
                    case 3:
                        String[] meses4 = {"Diciembre", "Enero", "Febrero"};
                        for (String mes : meses4) {
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println(mes);
                        }
                        break;
                }
            }
        }
    }
}
