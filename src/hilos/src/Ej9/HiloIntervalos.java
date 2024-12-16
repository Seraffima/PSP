package Ej9;

public class HiloIntervalos implements Runnable{
    private int num1;
    private int num2;

    public HiloIntervalos (int num1, int num2){
    this.num1 = num1;
    this.num2 = num2;
    }
    @Override
    public void run() {
        if (num2 > num1){
            for (int i = num1; i <= num2; i++){
                System.out.println(i);
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        } else {
            for (int i = num2; i <= num1; i++){
                System.out.println(i);
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
