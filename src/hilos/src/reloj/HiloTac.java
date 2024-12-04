package reloj;

public class HiloTac extends Thread {
    public void run() {
        do {
            System.out.println("Tac");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (true);
    }
}
