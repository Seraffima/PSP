public class HiloC extends Thread{
    private int c;
    public HiloC(int c){
        this.c = c;
        System.out.println("Creando hilo " + c);
    }
    public void run(){
        for (int i = 0; i < 5; i++){
            System.out.println("Hilo " + c + " línea " + i);
        }
    }
}
