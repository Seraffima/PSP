package Ej3;

import static java.lang.Thread.sleep;

public class HiloReloj {
    public static void main(String[] args) {
        HiloTic tic = new HiloTic();
        HiloTac tac = new HiloTac();
        tic.start();
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tac.start();
    }
}
