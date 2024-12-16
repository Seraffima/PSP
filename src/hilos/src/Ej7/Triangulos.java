package Ej7;

import java.util.Random;

public class Triangulos {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            Random rndom = new Random();
            int b = rndom.nextInt(10) + 1;
            int a = rndom.nextInt(10) + 1;
            TriCalc calc = new TriCalc(b, a);
            Thread tname = new Thread(calc);
            tname.start();
        }
        System.out.println("Todas las calculadoras creadas");
    }
}
